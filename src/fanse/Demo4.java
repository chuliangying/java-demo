package com.heima.fanse;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		Person p=new Person("����", 20);
		System.out.println(p);
		Tool_setProperty t=new Tool_setProperty();
		t.setProperty(p, "name", "����");
		t.setProperty(p, "age", 21);
		System.out.println(p);

	}

}
