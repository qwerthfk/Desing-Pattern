package Strategy_Pattern.rpsStrategy;

import java.util.Random;

/* Strategy 인터페이스를 구현하는 클래스 중 하나.
 * 직전 승부에서 이겼으면 다음에도 같은 손을 내는 전략의 클래스.
 * 직전 승부에서 졌다면 다음 손은 난수를 사용해 결정.
 */
public class WinningStrategy implements Strategy {

	private Random random;
	private boolean won = false; // 이전 승부의 결과를 저장
	private Hand prevHand; // 이전 승부에서 내밀었던 손 저장
	
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	
	public Hand nextHand() {
	  if(!won) { // 졌다면
	  	prevHand = Hand.getHand(random.nextInt(3));
	  }
	  return prevHand;  // 이겼다면
  }

	public void study(boolean win) {
	  won = win; // 직전에 낸 손이 이겼는지 졌는지 이전 승부 결과를 저장
  }
	

}
