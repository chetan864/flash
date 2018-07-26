package com.accenture;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		Thread t1 = new Thread(() -> {
			for(int i = 0;i<5;i++) {
				System.out.println("Hi" +Thread.currentThread().getPriority());
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace();}
			}
			
			
		
	},"Hi Thread");
		Thread t2 = new Thread(() -> {
			for(int i = 0;i<5;i++) {
				System.out.println("Hello");
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace();}
			}
		}, "Hello Thread");

		t1.start();
		t1.setPriority(Thread.MIN_PRIORITY);
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace();}
		t2.start();
		System.out.println(t1.isAlive());
		
		
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.join();
		t2.join();
		System.out.println(t2.isAlive());
	}

}
