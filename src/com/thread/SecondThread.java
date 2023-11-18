package com.thread;

public class SecondThread extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
	
			SecondThread thread = new SecondThread();
			thread.start();
			SecondThread thread1 = new SecondThread();
			thread1.start();
			SecondThread thread2 = new SecondThread();
			thread2.start();

	}

}
