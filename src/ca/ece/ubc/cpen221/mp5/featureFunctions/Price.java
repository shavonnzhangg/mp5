package ca.ece.ubc.cpen221.mp5.featureFunctions;

import ca.ece.ubc.cpen221.mp5.Restaurant;
import ca.ece.ubc.cpen221.mp5.RestaurantDB;
import ca.ece.ubc.cpen221.mp5.statlearning.MP5Function;

public class Price implements MP5Function {
	
	
	@Override
	public double f(Restaurant yelpRestaurant, RestaurantDB db) {
		return yelpRestaurant.getPrice() ;
	}

}
