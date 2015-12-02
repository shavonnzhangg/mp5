package ca.ece.ubc.cpen221.mp5.statlearning;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
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

	private static double getEuclideanDistance(Restaurant x, Location loc) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Location randomLocation() {
		// TODO Auto-generated method stub
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
}