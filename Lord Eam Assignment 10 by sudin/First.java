
class MyThread extends Thread{
    MyThread(String name)
    {
        super(name);
        System.out.println("Inside the Thread class");
    }

    public void run()
    {
        int i=1;
        while(i<=3)
        {
            System.out.println("Thread name is "+this.getName());
            try {
                Thread.sleep(450);

            } 
            catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class First {

    public static void main(String[] args)
    {
        MyThread t1=new MyThread("sudin");
        t1.start();
    }

}
