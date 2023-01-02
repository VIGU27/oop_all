package Db_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Car.CarClass;

public class LoadFileData {

	Scanner s;
	File infile;
	List<CarClass> Cars = new ArrayList<>();
	String records[];
	
	public List<CarClass> Load(){
		infile=new File("inputfile.txt");
		try {
			s=new Scanner(infile);
			while(s.hasNextLine()) {
				String lines=s.nextLine();
				
				System.out.println("#"+ lines);
				System.out.println("INPUT\n");
				String records[]=lines.split(",");
				Cars.add(new CarClass(records[0],records[1]));
			}
		}
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("OUTPUT\n");
			for(CarClass cars : Cars) 
			{
				System.out.println("BRAND -"+cars.getBrand()+ " Model -" + cars.getModel());
			}
		}
		return Cars;
	}	
}