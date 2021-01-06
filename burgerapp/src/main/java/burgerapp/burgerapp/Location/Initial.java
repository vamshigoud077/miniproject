package burgerapp.burgerapp.Location;

import java.util.ArrayList;

public class Initial implements LocInterface {
	ArrayList<Location> locationObject = new ArrayList<Location>();

	public Initial() {

		locationObject.add(new Location(19.18, 61.22, "212 Boston Dr, 28262, KC", "9876543987"));
		locationObject.add(new Location(29.84, 15.87, "2000 Drive , 28343, KC", "9089765456"));
		locationObject.add(new Location(47.38, 95.72, "980 Barren Dr, 28454, KC", "9876789876"));
		locationObject.add(new Location(39.18, 25.17, "605 Sharron Dr, 28989, KC", "9008009009"));
		locationObject.add(new Location(59.888, 66.667, "505 Karron Dr, 20001, KC", "9000900099"));
	}

	public ArrayList<Location> getlocationObject() {
		return locationObject;
	}

	public void addLoc(Location locObj) {

		locationObject.add(locObj);

	}

	public void removeLoc(Double longitude, Double latitude) {

		for (Location loc : locationObject) {

			if (longitude == loc.getLongitude() && latitude == loc.getLatitude()) {
				locationObject.remove(loc);
				break;
			}

		}

	}

	public void updateLoc(Double longitude, Double latitude, String phnnum) {

		for (Location loc : locationObject) {

			if (longitude == loc.getLongitude() && latitude == loc.getLongitude()) {
				loc.setPhnnum(phnnum);
				break;
			}
		}
	}

	public void searchNearestStore(Double longitude, Double latitude) {

		Double nearest = Double.MAX_VALUE;
		Location loc = null;
		if (locationObject.size() == 0) {
			System.out.println(" there are no  nearest Locations");
		}
		for (Location location : locationObject) {
			Double tem = distanceance(location.getLatitude(), location.getLongitude(), latitude, longitude);
			if (tem <= nearest) {
				nearest = tem;
				loc = location;
			}

		}

		System.out.println("Nearest location to the user is at : Longitude = " + loc.getLongitude() + ", Latitude = "
				+ loc.getLatitude() + ", Address = " + loc.getAddress() + ", Phnnum = " + loc.getPhnnum());

	}

	private double distanceance(double latitude1, double longitude1, double latitude2, double longitude2) {

		double theta = longitude1 - longitude2;
		double distance = Math.sin(degree2radius(latitude1)) * Math.sin(degree2radius(latitude2))
				+ Math.cos(degree2radius(latitude1)) * Math.cos(degree2radius(latitude2))
						* Math.cos(degree2radius(theta));
		distance = Math.acos(distance);
		distance = radius2degrees(distance);
		distance = distance * 60;
		distance = distance * 1852;
		return (distance);
	}

	private double degree2radius(double degree) {
		return (degree * Math.PI / 180.0);
	}

	private double radius2degrees(double radius) {
		return (radius * 180.0 / Math.PI);
	}

}
