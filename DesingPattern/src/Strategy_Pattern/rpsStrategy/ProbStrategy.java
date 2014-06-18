package Strategy_Pattern.rpsStrategy;

import java.util.Random;

// 또 하나의 구체적인 '전략'
// 다음 손은 언제나 난수로 결정하지만, 과거 승패 이력을 사용해 각각 손을 낼 확률 바꿈.
public class ProbStrategy implements Strategy {
	
	private Random random;
	private int prevHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = { // 과거의 승패를 반영한 확률계산을 위한 표
			{ 1, 1, 1 },
			{ 1, 1, 1 },
			{ 1, 1, 1 }
	};
	
	public ProbStrategy(int seed) {
		random = new Random(seed);
	}
	
	public Hand nextHand() {
	  int bet = random.nextInt(getSum(currentHandValue));
	  int handvalue = 0;
	  if(bet < history[currentHandValue][0]) {
	  	handvalue = 0;
	  } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
	  	handvalue = 1;
	  } else {
	  	handvalue = 2;
	  }
	  prevHandValue = currentHandValue;
	  currentHandValue = handvalue;
	  return Hand.getHand(handvalue);
	  
  }
	
	private int getSum(int hv) {
	  int sum = 0;
	  for(int i=0; i<3; i++) {
	  	sum += history[hv][i];
	  }
	  return sum;
  }

	public void study(boolean win) {
		if(win) {
			history[prevHandValue][currentHandValue]++;
		} else {
			history[prevHandValue][(currentHandValue + 1)%3]++;
		}
  }

}
