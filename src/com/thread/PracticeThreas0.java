package com.thread;

//	tried printing even and odd numbers using threads 
//	but i didn't get output. try again if you know

public class PracticeThreas0 extends Thread{
	static int sum;
	public void run() {
		System.out.println(++sum);
	}
	
	public static void main(String args[]) throws InterruptedException {
		PracticeThreas0 even = new PracticeThreas0();
		PracticeThreas0 odd  = new PracticeThreas0();
		
		if(sum%2 == 0) {
			even.start();
			odd.wait();
		}
		
		else {
			odd.start();
			even.wait();
		}
		
	}
}
