package Visitor_Pattern.dfVisitor;


/* Composite 패턴의 Main 클래스와 거의 동일.
 * 다른점은 Directory 내용을 표시하기 위해, 표시를 행하는 방문자인 ListVisitor의 인스턴스를 사용한다는 점.
 * Composite 패턴에서는 디렉터리를 표시하기 위해 
 * 							        printList(Directory 클래스(즉, 데이터 구조 클래스)에서 구현)라는 메소드 사용.
 * 이에 반해 Visitor 패턴에서는 디렉터리를 표시하는 것도 Visitor 클래스에서 실행.
 * 디렉터리의 표시도 데이터 구조 안의 각 요소에 대해서 실행하는 '처리'이기 때문.
 */
public class Main {

	public static void main(String[] args) throws FileTreatmentException {
	  System.out.println("Making root entries...");
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex", 20000));
		rootdir.accept(new ListVisitor()); 
		
		System.out.println("");
		System.out.println("Making user entries...");
		Directory Kim = new Directory("Kim");
		Directory Lee = new Directory("Lee");
		Directory Park = new Directory("Park");
		usrdir.add(Kim);
		usrdir.add(Lee);
		usrdir.add(Park);
		Kim.add(new File("diary.html", 100));
		Kim.add(new File("Composite.java", 200));
		Lee.add(new File("memo.tex", 300));
		Park.add(new File("game.doc", 400));
		Park.add(new File("junk.mail", 500));
		rootdir.accept(new ListVisitor());
  }
	
}
