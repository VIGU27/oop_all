package write_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vehicle.Car;

public class DataWriteClass {
	
	FileWriter write;
	File outfile;
	
	public void writedata(List<Car> Cars) {
		try {
			write = new FileWriter("outputfile.txt");
			
			List<Car> list = new ArrayList<>();
			list=Cars;
			System.out.println(list.size());
			for(Car cars : list) {
				write.write("BRAND -"+ cars.getBrand() + ", MODEL -"+ cars.getModel()+ System.lineSeparator());
			}
			write.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
