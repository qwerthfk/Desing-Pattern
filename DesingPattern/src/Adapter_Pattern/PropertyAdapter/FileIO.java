package Adapter_Pattern.PropertyAdapter;

import java.io.IOException;

public interface FileIO {

	public void readFromFile(String fileName) throws IOException;
	public void writeToFile(String fileName) throws IOException;
	public void setVaule(String key, String value);
	public String getValue(String key);
}
