package com.string.practice;

class Alpha {
	char type = 'a';

	protected Alpha() {
		type = 'a';
		System.out.println("alpha ");
	}
}

class Beta extends Alpha {
	public Beta() {

		System.out.println("beta ");
	}

	void go() {
		type = 'b';
		System.out.println(this.type + " " + super.type);
	}

}

public class p1 {

	/*
	 * public static void main(String[] args) throws Exception { // new Beta().go();
	 * StringBuffer s1 = new StringBuffer("Java"); String s2 = "Love"; String s3 =
	 * "Vishal"; s1.append(s3); s1.append(s2); int index = s1.indexOf(s2);
	 * System.out.println(index); }
	 */
	public static void main(String[] args) {
		new Thread(new Two(), "gfg1").start();
		
		
		
	}
}

class One implements Runnable {
	
	
	public void run() {
		System.out.print(Thread.currentThread().getName());
	}
}

class Two implements Runnable {
	public void run() {
		new One().run();
		new Thread(new One(), "gfg3").run();
		new Thread(new One(), "gfg3").start();
		
	}
}

class Base 
{ 
    private int data; 
  
    public Base() 
    { 
        data = 5; 
    } 
  
    protected int getData() 
    { 
        return this.data; 
    } 
} 
  
class Derived extends Base 
{ 
    private int data; 
    public Derived() 
    { 
        data = 6; 
    }
    
    public int getData() 
    { 
        return data; 
    } 
    public int getData(int... a)
    {
    	return (a[0]+2);
    }
  
    public static void main(String[] args) 
    { 
        Derived myData = new Derived(); 
        System.out.println(myData.getData()); 
    } 
} 


