package cn.husky.java_demo.pattern.singleton;

/**
 * 单例模式，饿汉式
 * @author 楚良营
 *
 */
public class HungrySingleton {

	private static final HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {};
	
	public static HungrySingleton getInstance() {
		return instance;
	}
}
