package Singleton_Pattern.TicketSingleton;

public class TicketMaker {

	private int ticket = 1000;
	
	private static TicketMaker ticketMaker = new TicketMaker();
	
	public static TicketMaker getInstance() {
		return ticketMaker;
	}
	
	private TicketMaker() {}
	
  public synchronized int getNextTicketNumber() {
  	return ticket++;
  }
}
