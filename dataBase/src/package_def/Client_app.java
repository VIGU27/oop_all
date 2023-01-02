package package_def;

import java.util.ArrayList;
import java.util.List;

import Db_package.*;
import Car.CarClass;


public class Client_app {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			LoadFileData lfd = new LoadFileData();
			RetriveFromDB rfd = new RetriveFromDB();
			
			
			List<CarClass> list = new ArrayList<>();
			list=lfd.Load();
			
			
			
			
			

		}

	}