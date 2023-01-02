package system_testing;

public class Car extends Vehicle {
	
	public Car() {
		super();
	}

	public void engine_test() {
		System.out.println("--- ENGINE OK ---");
	}
	
	public void audio_test() {
		System.out.println("--- AUDIO OK ---");
	}

	public void allignment_test() {
		System.out.println("--- ALLIGNMENT OK ---");
	}

}
