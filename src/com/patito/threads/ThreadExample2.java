package com.patito.threads;

//Threads
public class ThreadExample2 implements Runnable {
	private int currentValue;

	public ThreadExample2() {
		
		currentValue = 0;
		System.out.println(this);
		//hilos de usuario vs hilos daemon
		//el programa pede terminar antes de que terminen de ejecutarse los hilos daemon
		//el programa termina de ejecutarse hasta que se terminen de ejecutar los hilos de usuario
		
	}

	@Override
	public void run() {
		try {
			while (currentValue < 5) {
				System.out.println(Thread.currentThread().getName() 
						+ ": " + (currentValue++));
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()
					+": "+e.getMessage());
		}
		System.out.println("Exit from thread: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
       System.out.println("Main thread "+Thread.currentThread().getName());
	   
       ThreadExample2 te1= new ThreadExample2();
       ThreadExample2 te2= new ThreadExample2();
       
       Thread t1= new Thread(te1,"Thread A");
       Thread t2= new Thread(te2,"Thread B");
       //los hilos compiten por tiempos de ejecucion
       t1.start();
       t2.start();
       System.out.println("End Main thread");
	}// main

}
