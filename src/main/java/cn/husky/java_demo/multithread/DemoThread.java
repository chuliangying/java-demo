package cn.husky.java_demo.multithread;

import java.util.Date;

/**
 * 多线程演示
 * @author 楚良营
 *
 */
public class DemoThread extends Thread {

	private String name;

	public DemoThread(String name) {
		super();
		this.name = name;
	}
	
	@Override
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
