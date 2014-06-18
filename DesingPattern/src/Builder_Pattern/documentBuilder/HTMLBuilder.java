package Builder_Pattern.documentBuilder;

import java.io.*;

public class HTMLBuilder extends Builder {

	private String fileName;
	private PrintWriter writer;
	
	public void makeTitle(String title) {
	  // TODO Auto-generated method stub
	  fileName = title+".html";
	  try {
	  	writer = new PrintWriter(new FileWriter(fileName));
	  } catch(IOException e) {
	  	e.printStackTrace();
	  }
	  writer.println("<html><head><title>" + title + "</title></head><body>");
	  writer.println("<h1>" + title + "</h1>");
  }

	public void makeString(String str) {
	  // TODO Auto-generated method stub
	  writer.println("<p>" + str + "</p>");
  }

	public void makeItems(String[] items) {
	  // TODO Auto-generated method stub
	  writer.println("<ul>");
	  for(int i=0; i<items.length; i++) {
	  	writer.println("<li>" + items[i] + "</li>");
	  }
	  writer.println("</ul>");
  }

	public void close() {
	  // TODO Auto-generated method stub
	  writer.println("</body></html>");
	  writer.close();
  }

	public String getResult() {
		return fileName;
	}
}
