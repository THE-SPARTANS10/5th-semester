class Runnable1 implements Runnable{
    @Override
    public void run(){
        Thread currThread = Thread.currentThread();
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Name of thread is " + currThread.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MTTwo {
    public static void main(String[] args) throws Exception {
        Runnable1 obj = new Runnable1();
        Thread thread = new Thread(obj, "thisIsName");
        thread.start();
    }
}
