package Bridge_Pattern.displayBridge;

import java.io.*;

public class FileDisplayImpl extends DisplayImpl {
	
	private static final int MAX_READAHEAD_LIMIT = 4096; //반복 표시 할 수 있는 상한(버퍼사이즈)
	private String filename;
	private BufferedReader reader;
	
	public FileDisplayImpl(String filename) {
		this.filename = filename;
	}
	
	public void rawOpen() {
	  // TODO Auto-generated method stub
		try {
			reader = new BufferedReader(new FileReader(filename));
			reader.mark(MAX_READAHEAD_LIMIT);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("=-=-=-=-=-=" + filename + "=-=-=-=-=-=");
  }
	
	public void rawPrint() {
	  // TODO Auto-generated method stub
	  try {
	  	String line;
	  	reader.reset(); // mark 한 위치까지 되돌린다.
	  	while((line = reader.readLine()) != null) {
	  		System.out.println("> " + line);
	  	}
	  } catch (IOException e) {
	  	e.printStackTrace();
	  }
  }
	public void rawClose() {
	  // TODO Auto-generated method stub
	  System.out.println("=-=-=-=-=-=");
	  try {
	  	reader.close();
	  } catch (IOException e) {
	  	e.printStackTrace();
	  }
  }

}
