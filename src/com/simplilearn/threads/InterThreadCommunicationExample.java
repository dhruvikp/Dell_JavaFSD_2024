package com.simplilearn.threads;


class Customer {
	int balance = 10000;
	
	synchronized void withdraw(int amount) {
		if(this.balance < amount) {
			System.out.println("Less balance, waiting for deposit..");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Going to withdraw..");
		this.balance -= amount;
		System.out.println("withdraw completed..");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit..");
	
		this.balance += amount;
		System.out.println("Deposit completed..");
		this.notify();
	
	}
}

class WithdrawRunnable implements Runnable {

	Customer c;
	
	WithdrawRunnable(Customer c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		this.c.withdraw(15000);
	}
}


class DepositRunnable implements Runnable {

	Customer c;
	
	DepositRunnable(Customer c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		this.c.deposit(10000);
	}
}

public class InterThreadCommunicationExample {

	public static void main(String[] args) throws InterruptedException {
		
		Customer c = new Customer();
		
		Thread t1 = new Thread(new WithdrawRunnable(c));
		Thread t2 = new Thread(new DepositRunnable(c));
		
		t1.start();
		Thread.sleep(10000);
		t2.start();
		

	}

}
