class Sender
{
    public void send(String message)
    {
        System.out.println("Sending "  + message);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread was interrupted");
        }
        System.out.println(message + " was sent");
    }
}

class ThreadedSend extends Thread
{
    private String message;
    Sender senderObj;
    ThreadedSend(String m,  Sender obj)
    {
        message = m;
        senderObj = obj;
    }

    public void run()
    {
        synchronized(senderObj)
        {
            senderObj.send(message);
        }
    }
}
public class MTFive {
    public static void main(String[] args) throws InterruptedException {
        Sender obj = new Sender();
        ThreadedSend thread1 = new ThreadedSend( "message 1" , obj );
        ThreadedSend thread2 = new ThreadedSend( "message 2" , obj );
        thread1.start();
        thread2.start();
    }
}
