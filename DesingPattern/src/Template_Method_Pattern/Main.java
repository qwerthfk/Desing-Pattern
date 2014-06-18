package Template_Method_Pattern;

class A {
public A() {
	create();
}
public A(String str) {
	this();
}
static void create() {
	System.out.println("hello");
}
public void rideMethod() {
	System.out.println("A's Method");
}
public void loadMethod() {
	System.out.println("void Method");
}
}

class B extends A {
public B() {
	super("hi!");
}
public void rideMethod() {
	System.out.println("B's Method");
}
public void loadMethod(int num) {
	System.out.println("int Method");
}
}


public class Main {
public static void main(String[] args) {
	A a = new A();
	B b = new B();


	a.rideMethod();
	b.rideMethod();
}
}