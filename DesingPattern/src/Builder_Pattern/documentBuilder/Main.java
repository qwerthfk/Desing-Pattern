package Builder_Pattern.documentBuilder;

public class Main {

	public static void main(String[] arg) {
		String[] args = {"html"};
	  if(args.length != 1) {
	  	usage();
	  	System.exit(0);
	  }
	  if(args[0].equals("plain")) {
	  	TextBuilder textBuilder = new TextBuilder();
	  	Director director = new Director(textBuilder);
	  	director.construct();
	  	System.out.println(textBuilder.getResult());
	  } else if(args[0].equals("html")) {
	  	HTMLBuilder htmlBuilder = new HTMLBuilder();
	  	Director director = new Director(htmlBuilder);
	  	director.construct();
	  	System.out.println(htmlBuilder.getResult() + "가 작성되었습니다.");
	  } else {
	  	usage();
	  	System.exit(0);
	  }
	  
  }
	
	public static void usage() {
		System.out.println("Usage : java Main plain 일반 텍스트로 문자열 작성");
		System.out.println("Usage : java Main html HTML 파일로 문서작성");
	}
}
