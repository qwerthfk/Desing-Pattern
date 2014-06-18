package Bridge_Pattern.displayBridge;

// 점점 횟수를 늘려서 표시하는 '기능' 을 나타내는 클래스
public class IncreaseDisplay extends CountDisplay {

	private int step;
	public IncreaseDisplay(DisplayImpl impl, int step) {
		super(impl);
		this.step = step;
	}
	
	public void increaseDisplay(int level) {
		int count = 0;
		for(int i=0; i<level; i++) {
			multiDisplay(count);
			count+=step;
		}
	}
	
}
