package burgerapp.burgerapp.Location;

public class Location {

	private double latitude;
	private double longitude;
	private String phnnum;
	private String address;
	
	
	
	
	
	public Location(double latitude, double longitude, String phnnum, String address) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.phnnum = phnnum;
		this.address = address;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getPhnnum() {
		return phnnum;
	}
	public void setPhnnum(String phnnum) {
		this.phnnum = phnnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
