package concurrancy;

import java.util.concurrent.*;

public class CompletableFuture1 {

    public static void main ( String args[]){

        System.out.println("Completable Future Start !");
        /*
        ExecutorService executorService =  Executors.newFixedThreadPool(5);
        MyTask task1  = new MyTask();
        executorService.submit( task1 );
        MyTask task2  = new MyTask();
        executorService.submit( task2 );
        executorService.close();


         */
        MyVoidTask task1  = new MyVoidTask();

        CompletableFuture cF = CompletableFuture.runAsync( task1);
        try {
            cF.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completable Future Ended !!");
    }
}

class MyTask implements Callable {

    public String call(){
        for( int i = 0; i < 10; i++){
            System.out.println(  Thread.currentThread().getName() +  " :  Number : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return "Completed";
    }
}

class MyVoidTask implements Runnable {

    public  void  run(){
        for( int i = 0; i < 10; i++){
            System.out.println(  Thread.currentThread().getName() +  " :  Number : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
