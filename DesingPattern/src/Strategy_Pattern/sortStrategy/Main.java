package Strategy_Pattern.sortStrategy;

public class Main {

	public static void main(String[] args) {
	  String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};
	  SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
	  SortAndPrint iap = new SortAndPrint(data, new InsertionSorter());
	  SortAndPrint qap = new SortAndPrint(data, new QuickSorter());
	  //sap.execute();
	  qap.execute();
  }
}
