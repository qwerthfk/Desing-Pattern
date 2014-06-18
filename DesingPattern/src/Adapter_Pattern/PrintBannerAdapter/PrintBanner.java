package Adapter_Pattern.PrintBannerAdapter;

//교환장치(어댑터)
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
	  super(string);
	  // TODO Auto-generated constructor stub
  }

	public void printWeak() {
	  // TODO Auto-generated method stub
	  showWithParen();
  }

	public void printString() {
	  // TODO Auto-generated method stub
	  showWithAster();
  }

}
