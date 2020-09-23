package com.heima.fanse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws Exception, IOException {
		Juicer j=new Juicer();
		BufferedReader br=new BufferedReader(new FileReader("squeeze.properties"));
		Class clazz=Class.forName(br.readLine());
		Fruit f=(Fruit) clazz.newInstance();
		j.run(f);

	}

}
interface Fruit{
	public void squeeze();
}
class Apple implements Fruit{
	@Override
	public void squeeze() {
		System.out.println("榨出一杯苹果汁");
		
	}
}
class Orange implements Fruit{
	@Override
	public void squeeze() {
		System.out.println("榨出一杯橘子汁");
		
	}
}
class Juicer{
	public void run(Fruit f) {
		f.squeeze();
	}
}