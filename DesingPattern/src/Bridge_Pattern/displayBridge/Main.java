package Bridge_Pattern.displayBridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display(new StringDisplayImpl("Hello, korea."));
			// Display 클래스의 인스턴스를 대입
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, world."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
			// CountDisplay 클래스의 인스턴스를 대입
		
		//둘 다 StringDisplayImpl 클래스의 인스턴스가 구현을 담당.
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		
		RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
		d.randomDisplay(10);
		
		CountDisplay e = new CountDisplay(new FileDisplayImpl("star.txt"));
		e.multiDisplay(3);
		
		IncreaseDisplay i1 = new IncreaseDisplay(new CharDisplayImpl('<','*','>'), 1);
		IncreaseDisplay i2 = new IncreaseDisplay(new CharDisplayImpl('|','#','-'), 2);
		
		i1.increaseDisplay(4);
		i2.increaseDisplay(6);
	}

}
