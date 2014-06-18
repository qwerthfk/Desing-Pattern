package Strategy_Pattern.rpsStrategy;

// 가위바위보의 '손'을 표시하는 클래스.
public class Hand {

	public static final int HANDVALUE_GUU = 0; // 주먹을 표시하는 값
	public static final int HANDVALUE_CHO = 1; // 가위를 표시하는 값
	public static final int HANDVALUE_PAA = 2; // 보를 표시하는 값
	
	public static final Hand[] hand = { // 가위바위보의 손을 표시하는 3개의 인스턴스
		new Hand(HANDVALUE_GUU),
		new Hand(HANDVALUE_CHO),
		new Hand(HANDVALUE_PAA)
	};
	
	private static final String[] name = { // 가위바위보의 손의 문자열 표현
		"주먹", "가위", "보"
	};
	
	private int handvalue; // 가위바위보 손의 값
	
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	
	public boolean isStringerThen(Hand h) { // this가 h를 이길 경우 true
		return fight(h) == 1;
	}
	
	public boolean isWeakerThen(Hand h) { // this가 h에게 질 경우 true
		return fight(h) == -1;
	}
	
	private int fight(Hand h) {
		if(this == h) { // Hand 클래스의 인스턴스는 원래(주먹, 가위 보) 세 개만 존재하기 때문.
			return 0;			// handvalue 필드의 값이 같은 두 개의 인스턴스가 있으면 그들은 사실 같은 인스턴스이다.
		} else if((this.handvalue+1)%3 == h.handvalue) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return name[handvalue];
	}
}
