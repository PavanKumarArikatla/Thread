package com.thread;

class Hermoinee extends Thread{
	public void run() {
		System.out.println("Baguntadhi bhayya");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Ron implements Runnable{
	public void run() {
		System.out.println("vidi chelli baguntadhi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class HarryPotter {

	public static void main(String[] args) {
		Hermoinee herm = new Hermoinee();
		herm.start();
		Ron ron = new Ron();
		Thread t = new Thread(ron);
		t.start();

	}

}
