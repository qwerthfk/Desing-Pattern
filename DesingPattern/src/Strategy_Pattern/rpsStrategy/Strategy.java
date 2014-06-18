package Strategy_Pattern.rpsStrategy;

// 가위바위보의 '전략'을 표시하는 인터페이스
public interface Strategy {
	public abstract Hand nextHand(); // '다음에 낼 손을 얻기'위한 메소드
	public abstract void study(boolean win); 
	// '직전에 낸 손으로 이겼는지, 졌는지'를 학습하기 위한 메소드
	// 이겼을 경우 true, 진 경우 false
}
