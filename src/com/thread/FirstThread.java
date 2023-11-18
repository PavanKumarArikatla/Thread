package com.thread;

public class FirstThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		FirstThread thread = new FirstThread();
		FirstThread thread1 = new FirstThread();
		thread.start();
		thread1.start();
	
		
		//just to know how e.printStackTrace works
		
//		try {
//			int num = 2;
//			int result = num%0;
//			System.out.println(result);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}

	}

}
