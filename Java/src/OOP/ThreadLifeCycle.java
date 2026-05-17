class  ThreadLife extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"is in Running state");
    try {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"is Awake up");
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) {
        ThreadLife t1=new ThreadLife(); //Creating a instance of object->ThreadLife
        System.out.println("Thread is in New state");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is in Dead state");
    }
}
