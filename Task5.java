
package myFirstPro;

public class Task5 extends Thread {
	
	public void run()
	{
		System.out.println("Hello All");
	}
	
	public static void main(String[] args) {
		Task5 obj= new Task5();
		ThreadGroup threadGroup=new ThreadGroup("threadGroup");
		var t1=new Thread(threadGroup, obj, "Thread1");
		var t2=new Thread(threadGroup, obj, "Thread2");
		var t3=new Thread(threadGroup, obj, "Thread3");
		var t4=new Thread(threadGroup, obj, "Thread4");
		var t5=new Thread(threadGroup, obj, "Thread5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
