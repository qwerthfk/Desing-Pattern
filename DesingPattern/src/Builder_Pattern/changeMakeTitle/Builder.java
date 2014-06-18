package Builder_Pattern.changeMakeTitle;

// '문서'를 만들 메소드들을 선언하고 있는 추상 클래스
public abstract class Builder {

	private boolean initialized = false;
	
	public void makeTitle(String title) {
		if(!initialized) {
			buildTitle(title);
			initialized = true;
		}
	} // 타이틀

	public void makeString(String str) {
		if(initialized) {
			buildString(str);
		}
	}	// 문자열

	public void makeItems(String[] items) {
		if(initialized) {
			buildItems(items);
		}
	}	// 개별 항목을 문서 안에 구축
	
	public void close(){
		if(initialized) {
			buildDone();
		}
	} // 문서를 완성

	
	protected abstract void buildTitle(String title);
	protected abstract void buildString(String str);
	protected abstract void buildItems(String[] items);
	protected abstract void buildDone();
}
