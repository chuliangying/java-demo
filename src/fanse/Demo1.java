package com.heima.fanse;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1=Class.forName("com.heima.fanse.Person");
		Class clazz2=Person.class;
		Person p=new Person();
		Class clazz3=p.getClass();
		System.out.println(clazz1==clazz2);
		System.out.println(clazz2==clazz3);

	}

}
