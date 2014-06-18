package Strategy_Pattern.rpsStrategy;

// 가위바위보를 하는 사람을 표현한 클래스.
public class Player {
	
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;
	public Player(String name, Strategy strategy) { // 이름과 전략을 할당받는다.
		this.name = name;
		this.strategy = strategy;
	}
	
	public Hand nextHand() {  // 전략의 지시를 받는다.
		return strategy.nextHand(); // 자신이 해야 할 처리를 Strategy에게 맡기고 있는 즉, '위임'을 하고있다.
	}
	
	// 승부의 결과를 다음 승부에 활용하기 위해 strategy 필드를 통해 study 메소드를 호출.
	// study 메소드를 사용해서 전략의 내부 상태를 변화시킨다.
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	
	public void even() {
		gamecount++;
	}
	
	public String toString() {
		return "[" + name + " : " + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]"; 
	}
	
}
