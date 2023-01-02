package Car;

public class CarClass {
	private String brand;
	private String model;
	
	public CarClass(String brand,String model) {
		super();
		this.brand=brand;
		this.model=model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}