class MYRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface ");
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        MYRunnable myRunnable =new MYRunnable();
        Thread t1=new Thread(myRunnable);
        t1.start();
    }
}
