package Default;

public class Shop {
private String location;
	
	public Shop() {
		System.out.println("---* Welcome TO Tapri Bar *---");
		
	}
	
	public Shop(String loc) {
		location=loc;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
