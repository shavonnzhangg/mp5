package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.Set;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import ca.ece.ubc.cpen221.mp5.*;

public class Algorithms {

	/**
	 * Use k-means clustering to compute k clusters for the restaurants in the
	 * database.
	 * 
	 * @param db
	 * @return
	 */
	public static List<Set<Restaurant>> kMeansClustering(int k, RestaurantDB db) {
		List<Restaurant> allRestaurants = db.getRestaurants();

		List<Cluster> clusters = null;

		// create k random centroids
		for (int i = 0; i <= k-1; i++) {
			Cluster cluster = new Cluster(i);
			Location centroid = randomLocation();
			cluster.setCentroid(centroid);
		}
		
		boolean done = false;
		//continue to organize restaurants into clusters until centroids do not change
		while (!done) {
			//clear current list of clusters
			clusters.clear();

			List<Location> lastCentroids = getCentroid(clusters);
			
			//for every restaurant, calculate which centroid is closest
			//add restaurant to cluster containing closest centroid
			double distance;
			int assignedCluster = 0;
			for (Restaurant r : allRestaurants) {
				double minDistance = Double.MAX_VALUE;
				for (int i = 0; i < k-1; i++) {
					Cluster c = clusters.get(i);
					distance = getEuclideanDistance(new Location(r), c.getCentroid());
					if (distance < minDistance) {
						minDistance = distance;
						assignedCluster = i;
					}
				}
				clusters.get(assignedCluster).addPoint(r);
			}
			//for every cluster, find a new centroid
			Location newCentroid ;
			for (int i = 0; i < k-1; i++){
				newCentroid = getNewCentroid(clusters.get(i).getPoints());
				clusters.get(i).setCentroid(newCentroid);
			}
			
			//if centroid does not change, done computing
			List<Location> newCentroids = getCentroid(clusters);
			double d = 0.0;
			for (int i = 0; i < lastCentroids.size(); i++) {
				d += getEuclideanDistance((Location) newCentroids.get(i), (Location) lastCentroids.get(i));
			}
			if (d == 0.0)
				done = true;
		}
		//create a list of restaurant set to return
		List<Set<Restaurant>> finalClusters = new ArrayList<Set<Restaurant>>() ;
		for (Cluster cluster : clusters){
			finalClusters.add(cluster.getPoints()) ;
		}
		return finalClusters ;

	}


	public static String convertClustersToJSON(List<Set<Restaurant>> clusters) {
		// TODO: Implement this method
		return null;
	}

	public static MP5Function getPredictor(User u, RestaurantDB db, MP5Function featureFunction) {
		// TODO: Implement this method
		return null;
	}

	public static MP5Function getBestPredictor(User u, RestaurantDB db, List<MP5Function> featureFunctionList) {
		// TODO: Implement this method
		return null;
	}
	
	private static List<Location> getCentroid(List<Cluster> clusters) {
		List<Location> centroids = new ArrayList<Location>();
		for (Cluster cluster : clusters) {
			Location x = cluster.getCentroid();
			centroids.add(x);
		}
		return centroids;
	}

	private static Location getNewCentroid(Set<Restaurant> restaurants) {

		double xSum = 0.0;
		double ySum = 0.0;

		for (Restaurant x : restaurants) {
			xSum += x.getLatitude();
			ySum += x.getLongitude();

		}

		double xAvg = xSum / (restaurants.size() - 1);
		double yAvg = ySum / (restaurants.size() - 1);

		return new Location(xAvg, yAvg);
	}

	private static double getEuclideanDistance(Location x, Location loc) {
		double x1 = x.getX();
		double x2 = loc.getX();
		double y1 = x.getY();
		double y2 = loc.getY();

		// Calculate Euclidean Distance
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	}

	private static Location randomLocation() {
		Random rand = new Random();
		double x = rand.nextDouble();
		double y = rand.nextDouble();

		return new Location(x, y);
	}

}
