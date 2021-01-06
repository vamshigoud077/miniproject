package burgerapp.burgerapp.Location;


import java.util.Scanner;


public class LocationFunctionality {
	Scanner scan =  new Scanner(System.in);
	Initial initial;
	
	public LocationFunctionality() {
		this.initial = new Initial();
	}

	public void addLoc() {
		
		System.out.println("Enter the Longitude of the location: ");
		Double longitude = scan.nextDouble();
		System.out.println("Enter the Latitude of the location: ");
		Double latitude = scan.nextDouble();
		System.out.println("Enter the full address of the restaurant: ");
		scan.nextLine();
		String address = scan.nextLine();
		System.out.println("Enter the Phone number of the restaurant: ");
		String phnnum = scan.nextLine();
		
		Location location = new Location(longitude,latitude,address.trim(),phnnum.trim());
		this.initial.addLoc(location);
		
		System.out.println("Successfully added the Location ");
		
	}
	
	public void updateLoc() {
		
		System.out.println("Enter the Longitude for searching the restaurant: ");
		Double longitude = scan.nextDouble();
		System.out.println("Enter the Latitude for searching the restaurant: ");
		Double latitude = scan.nextDouble();
		System.out.println("Enter the phnnum that needs be updated: ");
		scan.nextLine();
		String phnnum = scan.nextLine().trim();
	
		this.initial.updateLoc(longitude,latitude, phnnum);
		
		System.out.println("Successfully updated the phone number of the restaurant");
	}
	
	public void removeLoc() {
		System.out.println("Enter the Longitude of the location that needs to be deleted: ");
		Double longitude = scan.nextDouble();
		System.out.println("Enter the Latitude of the location that needs to be deleted: ");
		Double latitude = scan.nextDouble();
		
		this.initial.removeLoc(longitude, latitude);
		
		System.out.println("Successfully removed the Location ");
	}
	
	public void showAllLoc() {
		System.out.println(" This is the list of all the locations of our store :");
		
		for(Location loc : this.initial.getlocationObject()) {
			
			System.out.println(" 1. Longitude "+ loc.getLongitude() +" , Latitude " + loc.getLatitude() +" , Address : "
			+ loc.getAddress()+ " , Phnnum : " + loc.getPhnnum());
		
		}
	
	}
	
	public void searchNearestStore() {
		
		System.out.println("Enter your current longitude location : ");
		Double longitude = scan.nextDouble();
		System.out.println("Enter your current latitude location : ");
		Double latitude = scan.nextDouble();
		
		this.initial.searchNearestStore(longitude, latitude);
		
	}

}


