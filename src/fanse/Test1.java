package com.heima.fanse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("squeeze.properties"));
		Class clazz=Class.forName(br.readLine());
		Object o=clazz.newInstance();
		Method m=clazz.getMethod("run");
		m.invoke(o);

	}

}
