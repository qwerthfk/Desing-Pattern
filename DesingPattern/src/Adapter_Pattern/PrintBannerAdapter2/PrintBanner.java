package Adapter_Pattern.PrintBannerAdapter2;

//교환장치(어댑터)
public class PrintBanner extends Print {

	private Banner banner;
	
	public PrintBanner(String string) {
	  this.banner = new Banner(string);
	  // TODO Auto-generated constructor stub
  }

	public void printWeak() {
	  // TODO Auto-generated method stub
	  banner.showWithParen();
  }

	public void printString() {
	  // TODO Auto-generated method stub
	  banner.showWithAster();
  }

}
