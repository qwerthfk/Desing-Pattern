package Adapter_Pattern.PropertyAdapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{

	/**
	 * 
	 */
  private static final long serialVersionUID = 1L;

	public void readFromFile(String fileName) throws IOException {
	  // TODO Auto-generated method stub
	  load(new FileInputStream(fileName));
  }

	public void writeToFile(String fileName) throws IOException {
	  // TODO Auto-generated method stub
	  store(new FileOutputStream(fileName), "written by FileProperties");
  }

	public void setVaule(String key, String value) {
	  // TODO Auto-generated method stub
	  setProperty(key, value);
  }

	public String getValue(String key) {
	  // TODO Auto-generated method stub
	  return getProperty(key, "");
  }

}
