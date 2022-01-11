
class MyThread extends Thread{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        while(true)
        {
            System.out.println("My thread name is "+this.getName());
        }
    }
}

public class Five 
{

    public static void main(String[] args)
    {
        MyThread t1=new MyThread("sudin");
        MyThread t2=new MyThread("soumya");
        MyThread t3=new MyThread("shourya");
        MyThread t4=new MyThread("sup");
        MyThread t5=new MyThread("udi");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
