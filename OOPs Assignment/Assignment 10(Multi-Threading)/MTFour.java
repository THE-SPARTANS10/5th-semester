class Runnable2 implements Runnable{
    @Override
    public void run(){
        while (true){
            System.out.println("This is "+Thread.currentThread().getName());
        }
    }
}
public class MTFour {
    public static void main(String[] args)  {
        Runnable2 obj = new Runnable2();
        Thread thread1 = new Thread(obj, "Thread1");
        Thread thread2 = new Thread(obj, "Thread2");
        Thread thread3 = new Thread(obj, "Thread3");
        Thread thread4 = new Thread(obj, "Thread4");
        Thread thread5 = new Thread(obj, "Thread5");
        thread5.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
