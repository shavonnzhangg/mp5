package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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
		List<Restaurant> allRestaurants = db.getAllRestaurants();

		HashMap<Location, ArrayList<Restaurant>> clusters = new HashMap<Location, ArrayList<Restaurant>>();

		// create k random centroids
		Random rand = new Random();
		for (int i = 0; i <= k; i++) {
			Location cluster = randomLocation();
			clusters.put(cluster, new ArrayList<Restaurant>());
		}
		// Iterate through all restaurants, and calculate the Euclidean distance
		// between its location
		// and every cluster

		for (Restaurant x : allRestaurants) {
			double minDistance = Double.MAX_VALUE;
			Location assignedCluster = null ;
			for (Location loc : clusters.keySet()) {
				double distance = getEuclideanDistance(x, loc);
				if(distance < minDistance)
					minDistance = distance ;
					assignedCluster = loc ;
			}
			// group restaurants into clusters, where each cluster contains all
			// restaurants
			// closest to the same centroid
			clusters.get(assignedCluster).add(x) ;
		}

		// Compute new centroid for each non-empy cluster
		
		return null;
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

	private static double getEuclideanDistance(Restaurant r1, Location r2) {
		// get the coordinates of the two restaurants
		double x1 = r1.getLatitude();
		double x2 = r2.getLatitude();
		double y1 = r1.getLongitude();
		double y2 = r2.getLongitude();

		// Calculate Euclidean Distance
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

	}

	private static Location randomLocation() {
		Random rand = new Random();
		double x = rand.nextDouble() ;
		double y = rand.nextDouble() ;
		
		return new Location (x, y) ;
}