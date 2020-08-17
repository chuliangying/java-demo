package cn.husky.java_demo.multithread;

import java.util.Date;

public class DemoRunable implements Runnable {
	
	public String name;

	public DemoRunable(String name) {
		super();
		this.name = name;
	}


	public void run() {
		System.out.println("Thread " + name + " begin at "+ new Date());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + name + " finish at "+ new Date());

	}

}
