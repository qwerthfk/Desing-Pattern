package Factory_Method_Pattern.framework;

/*
 * 이 클래스에서 Template Method 패턴이 사용된다.
 * create 메소드에서 Product 인스턴스를 생성하는 것으로 규정하고 있다.
 * Factory Method 패턴에서는 인스턴스를 생성할 때 Template Method 패턴 사용.
 */

public abstract class Factory {
	
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	
	protected abstract void registerProduct(Product product);
	
}
