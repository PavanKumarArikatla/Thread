package com.thread;

class Runnable1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runnable2 implements Runnable
{
	public void run()
	{
		for(int i=5;i>0;i--)
		{
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SecondRunnable
{
	public static void main(String[] args) 
	{
		Runnable1 obj1 = new Runnable1();
		Thread thread1 = new Thread(obj1);
		Runnable2 obj2 = new Runnable2();
		Thread thread2 = new Thread(obj2);
		thread1.start();
		thread2.start();
	}

}
