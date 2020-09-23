package com.heima.fanse;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(52);
		list.add(80);
		Class clazz=Class.forName("java.util.ArrayList");
		Method m=clazz.getMethod("add", Object.class);
		m.invoke(list, "abc");
		System.out.println(list);

	}

}
