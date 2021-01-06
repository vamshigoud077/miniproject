package burgerapp.burgerapp.Location;


	public interface LocInterface {

		public void addLoc(Location locationObject);
		public void removeLoc(Double longitude, Double latitude);
		public void updateLoc(Double longitude, Double latitude, String phnnum);
		public void searchNearestStore(Double longitude,Double latitude)
	;	
	}


