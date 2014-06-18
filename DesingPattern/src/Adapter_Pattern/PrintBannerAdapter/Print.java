package Adapter_Pattern.PrintBannerAdapter;

// 필요한 것(직류 12볼트)
public interface Print {
	
	public abstract void printWeak(); // 문자열에 괄호 사용
	public abstract void printString(); // 문자열 전후에 *를 표시
}
