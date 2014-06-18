package Adapter_Pattern.PropertyAdapter;

import java.io.IOException;

public class AdapterMain {

	public static void main(String[] args) {
	  
		FileIO f = new FileProperties();
		
		try {
			f.readFromFile("file.txt");
			f.setVaule("year", "2004");
			f.setVaule("month", "4");
			f.setVaule("day", "21");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
  }
}
