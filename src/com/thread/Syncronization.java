package com.thread;

class Something extends Thread
{
	int count;
	@Override 
	public void run()
	{
		while(count<=10)
		{
			System.out.println(count);
			count++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Syncronization {

	public static void main(String[] args)
	{
		Something thread1 = new Something();
		Something thread2 = new Something();
		thread1.start();
		thread2.start();
		
	}

}
