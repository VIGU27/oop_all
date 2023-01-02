package default_package;

import java.util.List;

import load_data.DataLoadClass;
import vehicle.Car;
import write_data.DataWriteClass;

import java.util.ArrayList;
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataLoadClass dlc = new DataLoadClass();
		
		List<Car> list = new ArrayList<>();
		list=dlc.Load();
		
		DataWriteClass drc = new DataWriteClass();
		drc.writedata(list);

	}

}
