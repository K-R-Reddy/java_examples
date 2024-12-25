class Threadeg1 extends Thread{
    synchronized public void run(){
    for(int i=1;i<6;i++){
        System.out.println(Thread.currentThread().getName());
    }
    }
    }
    class Threadeg2 extends Thread{
       synchronized public void run(){
        for(int i=1;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
        }
        }
public class SynchroThread {
    public static void main(String[] args) {
        Threadeg1 t1=new Threadeg1();
        Threadeg1 t2=new Threadeg1();
        Threadeg2 t3=new Threadeg2();
        Threadeg2 t4=new Threadeg2();
        t1.start();
        t3.start();
        t2.start();
        t4.start();
    
}
}
