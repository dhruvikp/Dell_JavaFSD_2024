package com.simplilearn.threads;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreads multiThread = new MultiThreads();
		Thread t1 = new Thread(multiThread);
	
		t1.start();
		//t1.start();
		
		Thread.sleep(100);
		System.out.println("Main thread ends");
	
	}
}

class MultiThreads implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside thread..");
	}
}