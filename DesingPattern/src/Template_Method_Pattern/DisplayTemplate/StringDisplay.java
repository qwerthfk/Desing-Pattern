package Template_Method_Pattern.DisplayTemplate;

public class StringDisplay extends AbstractDisplay {

	private String str;
	private int width;

	public StringDisplay(String str) {
		this.str = str;
		width = str.getBytes().length;
	}

	public void open() {
		// TODO Auto-generated method stub
		printLine();
	}

	private void printLine() {
	  // TODO Auto-generated method stub
	  System.out.print("+");
	  for(int i=0; i<width; i++) {
	  	System.out.print("-");
	  }
	  System.out.println("+");
  }

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("|" + str + "|");
	}

	public void close() {
		// TODO Auto-generated method stub
		printLine();
	}

}
