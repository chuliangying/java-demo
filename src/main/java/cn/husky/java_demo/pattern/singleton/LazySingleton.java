package cn.husky.java_demo.pattern.singleton;
/**
 * 单例模式 懒汉式
 * @author 楚良营
 *
 */
public class LazySingleton {

	private static volatile LazySingleton instanceLazySingleton = null;
	
	private LazySingleton() {}
	
	public static synchronized LazySingleton getInstance() {
		if (instanceLazySingleton == null) {
			instanceLazySingleton = new LazySingleton();
		}
		return instanceLazySingleton;
	}
}
