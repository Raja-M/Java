package concurrancy;

class Table
{
    synchronized static void printTable(int n , String threadName){
        for(int i=1;i<=10;i++){
            System.out.println( threadName + " : " +  n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}
class MyThread1 extends Thread{
    public void run(){

        Table.printTable(1 , this.getName());
    }
}
class MyThread2 extends Thread{
    public void run(){
        Table.printTable(10, this.getName());
    }
}
class MyThread3 extends Thread{
    public void run() {
        Table.printTable(100, this.getName());
    }
}
class MyThread4 extends Thread{
    public void run(){
        Table.printTable(1000 , this.getName());
    }
}
public class SynchronizedStatic {
    public static void main(String args[]) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4=new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
