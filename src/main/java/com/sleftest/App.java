package com.sleftest;

/**
 * Hello world!
 *
 */
public class App implements Runnable
{
	public App(int data) {
		System.out.println(data);
	}

	public void run() {
		System.out.println("===============================");
		System.out.println( "**** Thnread  Count : "+Thread.currentThread().getId()+" ****");
		System.out.println("===============================");		
	}


    public static void main( String[] args )
    {
      App a = new App(23);
      Thread t = new Thread(a);
      t.start();
      Thread t2 = new Thread(a);
      t2.start();
    }
}
