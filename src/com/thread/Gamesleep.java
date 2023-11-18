package com.thread;

//class sleepthread extends Thread{
//	@Override
//	public void run() 
//	{
//		int n=0;
//		
//		
//	}
//}

public class Gamesleep {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("hello");
		Thread.sleep(1000); // Just to give the user a chance to see "hello".
		System.out.print("\b\b\b\b\b");
		System.out.print("world");
	}

}
