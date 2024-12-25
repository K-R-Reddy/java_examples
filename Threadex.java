class Threadeg1 extends Thread{
public void run(){
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
public class Threadex {
    public static void main(String[] args) {
    Threadeg1 t1=new Threadeg1();
    Threadeg1 t2=new Threadeg1();
    t1.start();
    t2.start();
    System.out.println("Thread 2 is alive? "+t2.isAlive()); 
    try{
    t2.join();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    System.out.println("Thread 1 is alive? without join() : "+t1.isAlive()); 
    System.out.println("Thread 2 is alive? with join() : "+t2.isAlive()); 
    
}
    
}
