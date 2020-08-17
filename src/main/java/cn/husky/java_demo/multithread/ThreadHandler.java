package cn.husky.java_demo.multithread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadHandler {
	
	ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
	
	//演示thread多线程
	public void showDemoThread() {
		for (int i = 0; i < 5; i++) {
			DemoThread demoThread = new DemoThread("demoThread" + i);
			demoThread.start();
		}
	}
	
	//演示runable多线程
	public void showDemoRunable() {
		for (int i = 0; i < 5; i++) {
			cachedThreadPool.execute(new DemoRunable("demoRunable" + i));
		}
	}
	
	//演示callable多线程
	public List<Long> showDemoCallable() throws InterruptedException, ExecutionException {
		List<FutureTask<Long>> tasks = new ArrayList<FutureTask<Long>>();
		List<Long> results = new ArrayList<Long>();
		for (int i = 0; i < 5; i++) {
			DemoCallable demoCallable = new DemoCallable("demoCallable" + i);
			FutureTask<Long> futureTask = new FutureTask<Long>(demoCallable);
			tasks.add(futureTask);
			cachedThreadPool.submit(futureTask);
		}
		outer:
			while(true) {
				Iterator<FutureTask<Long>> iterator = tasks.iterator();
				while (iterator.hasNext()) {
					FutureTask<Long> task = iterator.next();
					if (task.isDone()) {
						results.add(task.get());
						iterator.remove();
					}else {
						continue outer;
					}
				}	
				break;
			}
        
		return results;	
	}
	
	public void shutdown(){
		cachedThreadPool.shutdown();
	}

}
