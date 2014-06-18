package Adapter_Pattern.PrintBannerAdapter;

// 제공되고 있는 것 (교류 100볼트)
public class Banner {

	private String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParen() { // 문자열을 괄호로 묶어서 표시하는 method
		System.out.println("("+string+")");
	}
	
	public void showWithAster() { // 뮨저욜 존휴애 *를 붙여 표시하는 method
		System.out.println("*"+string+"*");
	}
	
}
