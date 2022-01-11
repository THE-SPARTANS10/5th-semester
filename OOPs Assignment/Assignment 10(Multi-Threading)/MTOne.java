class MyThread extends Thread{
    public MyThread(String myThread) {
        super(myThread);
        System.out.println("This is a startup message");
    }

    @Override
    public void run(){
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Name of thread is " + this.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MTOne {
    public static void main(String[] args){
        MyThread thread = new MyThread("MyThread");
        thread.start();
    }
}
