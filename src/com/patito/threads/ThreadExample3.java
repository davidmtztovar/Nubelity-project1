package com.patito.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample3 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int total=0;
		for(int i=0;i<5;i++) {
			System.out.println("-- i value: "+i);
			total+=1;
			Thread.sleep(250);
		}
		Thread.currentThread().getName();
		return total;
	}

	public static void main(String[] args) {
		ExecutorService service= Executors.newFixedThreadPool(1);
		Future<Integer> result=service.submit(new ThreadExample3());
		while(!result.isDone()) {}
			try {
				System.out.println(result.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("-- After future");
		
		for (String string : args) {
			
		}
			
	}
}
