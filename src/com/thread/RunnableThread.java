package com.thread;

public class RunnableThread implements Runnable{
	@Override
	public void run() 
	{
		for(int i=0;i<=3;i++) 
		{
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		RunnableThread obj = new RunnableThread();
		Thread thread = new Thread(obj);
		Thread thread1 = new Thread(obj);
		thread.start();
		thread1.start();
	}

}
