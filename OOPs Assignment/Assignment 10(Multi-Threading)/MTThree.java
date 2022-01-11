class MyThread3 extends Thread{
    public MyThread3(String myThread) {
        super(myThread);
    }
    @Override
    public void run(){
       while (true){
            System.out.println("This is "+this.getName());
        }
    }
}
public class MTThree {
    public static void main(String[] args)  {
        MyThread3 thread1 = new MyThread3("Thread1");
        MyThread3 thread2 = new MyThread3("Thread2");
        MyThread3 thread3 = new MyThread3("Thread3");
        MyThread3 thread4 = new MyThread3("Thread4");
        MyThread3 thread5 = new MyThread3("Thread5");
        thread5.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
