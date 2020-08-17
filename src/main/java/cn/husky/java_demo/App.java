package cn.husky.java_demo;

import java.util.List;
import java.util.concurrent.ExecutionException;

import cn.husky.java_demo.multithread.ThreadHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Main!" );
        
        ThreadHandler threadHandler = new ThreadHandler();
        threadHandler.showDemoThread();
        
        threadHandler.showDemoRunable();
       
        
        try {
			List<Long> results = threadHandler.showDemoCallable();
			threadHandler.shutdown();
			for (Long result : results) {
				System.out.println(result);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
    }
}
