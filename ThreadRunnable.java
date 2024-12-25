class Threadeg implements Runnable{
public void run (){
    for(int i=1;i<6;i++){
        System.out.println(Thread.currentThread().getName()+" : "+i);
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
}
public class ThreadRunnable {
    public static void main(String[] args) {
        Threadeg r1=new Threadeg();
        Threadeg r2=new Threadeg();
        Threadeg r3=new Threadeg();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread 1 Priority : "+t1.getPriority());
        System.out.println("Thread 2 Priority : "+t2.getPriority());
        System.out.println("Thread 3 Priority : "+t3.getPriority());
    }
    
}
