class TeacherThread extends Thread{
    public void run(){
        System.out.println("Thread is running using Thread class");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        TeacherThread t1=new TeacherThread();
        t1.start();
    }
}
