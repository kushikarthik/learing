package AsstPraticeProjects;
public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.setName("ravi");
		td.setPriority(4);
		ThreadDemo td1 = new ThreadDemo();
		td.setName("ravi111");
		td.setPriority(10);
		td.start();
		td1.start();
	}
   public void run() {
	System.out.println("run method executing");
	for(int i=0;i<10;i++);
	{
		System.out.println(Thread.currentThread().getName());
	}
   }
}
   
	