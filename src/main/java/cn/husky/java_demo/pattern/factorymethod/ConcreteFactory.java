package cn.husky.java_demo.pattern.factorymethod;

public class ConcreteFactory implements Factory {

	public Product newProduct() {
		// TODO Auto-generated method stub
		return new ConcreteProduct();
	}

}
