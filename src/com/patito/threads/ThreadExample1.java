package com.patito.threads;

//Threads
public class ThreadExample1 extends Thread {
	private int currentValue;

	public ThreadExample1(String name) {
		super(name);
		currentValue = 0;
		System.out.println(this);
		//hilos de usuario vs hilos daemon
		//el programa pede terminar antes de que terminen de ejecutarse los hilos daemon
		//el programa termina de ejecutarse hasta que se terminen de ejecutar los hilos de usuario
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
		try {
			while (currentValue < 5) {
				System.out.println(getName() + ": " + (currentValue++));
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			System.out.println(getName()+": "+e.getMessage());
		}
	}

	public static void main(String[] args) {
       System.out.println("Main thread "+Thread.currentThread().getName());
	   
       new ThreadExample1("Thread A");
       new ThreadExample1("Thread B");
       //los hilos compiten por tiempos de ejecucion
       System.out.println("End Main thread");
	}// main

}
