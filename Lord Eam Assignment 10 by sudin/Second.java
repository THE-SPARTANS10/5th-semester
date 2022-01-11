
class MyThread implements Runnable{
    
    public void run()
    {
        int i=1;
        while(i<=3)
        {
            System.out.println("My Nmae is: "+Thread.currentThread().getName());
            try {
                Thread.sleep(450);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            i++;
        }
    }
}

class Main extends Thread{
    Main(MyThread m,String name)
    {
        
        super(m,name);
        System.out.println("Welcome to a new Thread");
    }
}

public class Second {
    public static void main(String[] args)
    {
        Main t1=new Main(new MyThread(),"sudin jana");
        t1.start();
    }
}
