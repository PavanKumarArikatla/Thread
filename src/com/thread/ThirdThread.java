package com.thread;

class UnknownThread extends Thread{
	public void run() {
		for(int i=5;i>0;i--){
			System.out.print(i+" ");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThirdThread extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print(i+" ");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		
		ThirdThread thread = new ThirdThread();
		UnknownThread thread1= new UnknownThread();
		ThirdThread thread2= new ThirdThread();
		
		thread.start();
		thread1.start();
		thread2.start();
		
		

	}

}
