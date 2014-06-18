package Strategy_Pattern.sortStrategy;

public class InsertionSorter implements Sorter {

	public void sort(Comparable[] data) {
		int i,j;
		for(i=1; i<data.length; i++) {
			Comparable min = data[i];
			for(j=i; j>0; j--) {
				if(data[j-1].compareTo(min) > 0) {
					data[j] = data[j-1];
				} else {
					break;
				}
			}
			data[j] = min;
		}
	}

}
