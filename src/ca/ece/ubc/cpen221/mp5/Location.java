package ca.ece.ubc.cpen221.mp5;

import java.util.Random;

public class Location {
	private double x;
	private double y;
	
	public Location(Restaurant r1) {
		this(r1.getLatitude(), r1.getLongitude());
}

	public Location(double x, double y) {
		this.x = x ;
		this.y = y ;
	}
	

}