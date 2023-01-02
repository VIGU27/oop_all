package system_testing;

public class Truck extends Vehicle implements Commercial_vehicle{
	
	public Truck() {
		super();
	}

	public void truck_engine_test() {
		TruckStartStop t = new TruckStartStop();
		t.startengine();
		System.out.println("--- ENGINE OK ---");
		t.stopengine();
		System.out.println("cubic capacity of truck - "+this.CC);
		System.out.println("name of truck - "+this.name);
	}
	
	public void truck_audio_test() {
		System.out.println("--- AUDIO OK ---");
	}

	public void truck_allignment_test() {
		System.out.println("--- ALLIGNMENT OK ---");
		System.out.println("number of tyres - "+this.tyre);
	}

}
