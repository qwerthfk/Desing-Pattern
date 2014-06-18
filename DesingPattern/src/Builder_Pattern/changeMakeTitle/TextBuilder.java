package Builder_Pattern.changeMakeTitle;

public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer(); // 필드의 문서를 구축
	public void buildTitle(String title) {
	  // TODO Auto-generated method stub
	  buffer.append("===============================\n");
	  buffer.append("["+title+"]\n");
	  buffer.append("\n");
  }

	public void buildString(String str) {
	  // TODO Auto-generated method stub
	  buffer.append('@'+str+"\n");
	  buffer.append("\n");
  }

	public void buildItems(String[] items) {
	  // TODO Auto-generated method stub
	  for(int i=0; i<items.length; i++) {
	  	buffer.append("  *"+items[i]+"\n");
		  buffer.append("\n");
	  }
  }

	public void buildDone() {
	  // TODO Auto-generated method stub
	  buffer.append("===============================\n");
  }
	
	public String getResult() {
		return buffer.toString();
	}

}
