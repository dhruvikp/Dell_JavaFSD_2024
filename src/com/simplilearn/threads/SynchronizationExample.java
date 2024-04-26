package com.simplilearn.threads;

public class SynchronizationExample {

	public static void main(String[] args) {

		Table t = new Table();
		//t.printTable(5);
		
		PrintTableRunnable printRunnable1 = new PrintTableRunnable(t, 5);	
		PrintTableRunnable printRunnable2 = new PrintTableRunnable(t, 6);
	
		Thread t1 = new Thread(printRunnable1);
		Thread t2 = new Thread(printRunnable2);
		
		t1.start();
		t2.start();
		
		
		
	}

}

class PrintTableRunnable implements Runnable {
	Table t;
	int n;

	public PrintTableRunnable(Table t, int n) {
		this.t = t;
		this.n = n;
	}
	
	@Override
	public void run() {
		t.printTable(n);
	}
}


class Table {
	 void printTable(int n) {
		 
		 synchronized(this) {
			 for (int i = 1; i <= 10; i++) {
					System.out.println(n + " * " + i + " = " + n * i);
				} 
		 }
		
	}
}