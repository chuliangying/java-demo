package cn.husky.java_demo.multithread;

import java.util.Date;
import java.util.concurrent.Callable;

public class DemoCallable implements Callable<Long> {
	
	private String name;

	public DemoCallable(String name) {
		super();
		this.name = name;
	}
	
	public Long call() throws Exception {
		Date beginDate = new Date();
		System.out.println("Thread " + name + " begin at "+ beginDate);
		for (int i = 0; i < 10; i++) {
			try {
				int ms = (int)(Math.random()*1000 + 1000);
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Date endDate = new Date();
		System.out.println("Thread " + name + " finish at "+ endDate);
		long time = endDate.getTime() - beginDate.getTime();
		return time;
	}

}
