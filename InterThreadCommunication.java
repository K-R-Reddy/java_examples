public class InterThreadCommunication {
    private static Object lock =new Object();
    public static void main(String[] args) {
        Threadeg1 t1=new Threadeg1();
        Threadeg2 t2=new Threadeg2();
        t1.start();
        t2.start();
    }
    static class Threadeg1 extends Thread{
        public void run(){
            for(int i=0;i<10;i++){
                synchronized(lock){
                    System.out.println(Thread.currentThread().getName());
                    try{
                        lock.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class Threadeg2 extends Thread{
        public void run(){
            for(int i=0;i<10;i++){
                synchronized(lock){
                    System.out.println(Thread.currentThread().getName());
                        lock.notify();
                }
            }
        }
    }
    
}


