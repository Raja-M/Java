<<<<<<< HEAD
/*


Runnable
	run()
	



Thread
	
	Thread( )
	
	run ()
	
	Start()
	
	sleep()
	
	wait()
	
	notify()
	
notifyAll()

*/
class SimpleThreads {

    // Display a message, preceded by
    // the name of the current thread
	public static int numTest = 100;
	
	
	
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class MessageLoop
        implements Runnable {
        public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            try {
                for (int i = 0;
                     i < importantInfo.length;
                     i++) {
                    // Pause for 4 seconds
                    Thread.sleep(4000);
                    // Print a message
                    threadMessage(importantInfo[i]);
                    numTest++;
                    System.out.format("%n In Loop1%d", numTest);
                    
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    public static class MessageLoop2
    	implements Runnable {
    	public void run(){
    		for(int i = 0; i < 10; i++ ){
    			System.out.format("%n In Loop2%d",numTest--);
    			try{
    				Thread.sleep(4000);
    			} catch(InterruptedException e){
    				threadMessage(" Loop2 interrupted");
    			}
    			
    		}
    	}
    }	
    
    
    public static void main(String args[])
        throws InterruptedException {

        // Delay, in milliseconds before
        // we interrupt MessageLoop
        // thread (default one hour).
        long patience = 1000  * 10;

        // If command line argument
        // present, gives patience
        // in seconds.
        
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();
        
        Thread t2 = new Thread(new MessageLoop2());
        t2.start();
        t2.join();
        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop
        // thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second
            // for MessageLoop thread
            // to finish.
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)
                  && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                // Shouldn't be long now
                // -- wait indefinitely
                t.join();
            }
        }
        threadMessage("Finally!");
    }
}


/************
*************
**************
*/
 class SleepMessages {
    public static void main(String args[])
        throws InterruptedException {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}
/*
UDW_CUST_PLN_ID:int64 {quote=none, null_field=''};
BUS_EFF_DT:date {null_field=''};
BUS_EXPIR_DT:date {null_field=''};
TM_ATR_CD:string[5];
TM_ATR_VALUE:string[1];
CUST_PLN_ROW_IND:int32;



readRecord(0);
doTransfersFrom(0);			

if( (inputDone(0)!=1) ){	
	Output0.UDW_CUST_PLN_ID	=	Input0.UDW_CUST_PLN_ID	;
	Output0.BUS_EFF_DT	=	Input0.BUS_EFF_DT	;
	Output0.BUS_EXPIR_DT	=	Input0.BUS_EXPIR_DT	;
	Output0.TM_ATR_CD	 =	Input0.TM_ATR_CD	;
	Output0.TM_ATR_VALUE	=	Input0.TM_ATR_VALUE	;
	Output0.CUST_PLN_ROW_IND	=	Input0.CUST_PLN_ROW_IND	;
}

doTransfersTo(0);
writeRecord(0);

/***************
*****************
*****************

import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        Random random = new Random();

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        drop.put("DONE");
    }
}


/****

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}

/*******************
public class Drop {
    // Message sent from producer
    // to consumer.
    private String message;
    // True if consumer should wait
    // for producer to send message,
    // false if producer should wait for
    // consumer to retrieve message.
    private boolean empty = true;

    public synchronized String take() {
        // Wait until message is
        // available.
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        // Toggle status.
        empty = true;
        // Notify producer that
        // status has changed.
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        // Wait until message has
        // been retrieved.
        while (!empty) {
            try { 
                wait();
            } catch (InterruptedException e) {}
        }
        // Toggle status.
        empty = false;
        // Store message.
        this.message = message;
        // Notify consumer that status
        // has changed.
        notifyAll();
    }
}

/*******************************

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();
        for (String message = drop.take();
             ! message.equals("DONE");
             message = drop.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}
*/
=======
///*
//
//
//Runnable
//	run()
//
//
//
//
//Thread
//
//	Thread( )
//
//	run ()
//
//	Start()
//
//	sleep()
//
//	wait()
//
//	notify()
//
//notifyAll()
//
//*/
//public class SimpleThreads {
//
//    // Display a message, preceded by
//    // the name of the current thread
//	public static int numTest = 100;
//
//
//
//    static void threadMessage(String message) {
//        String threadName =
//            Thread.currentThread().getName();
//        System.out.format("%s: %s%n",
//                          threadName,
//                          message);
//    }
//
//    private static class MessageLoop
//        implements Runnable {
//        public void run() {
//            String importantInfo[] = {
//                "Mares eat oats",
//                "Does eat oats",
//                "Little lambs eat ivy",
//                "A kid will eat ivy too"
//            };
//            try {
//                for (int i = 0;
//                     i < importantInfo.length;
//                     i++) {
//                    // Pause for 4 seconds
//                    Thread.sleep(4000);
//                    // Print a message
//                    threadMessage(importantInfo[i]);
//                    numTest++;
//                    System.out.format("%n In Loop1%d", numTest);
//
//                }
//            } catch (InterruptedException e) {
//                threadMessage("I wasn't done!");
//            }
//        }
//    }
//
//    public static class MessageLoop2
//    	implements Runnable {
//    	public void run(){
//    		for(int i = 0; i < 10; i++ ){
//    			System.out.format("%n In Loop2%d",numTest--);
//    			try{
//    				Thread.sleep(4000);
//    			} catch(InterruptedException e){
//    				threadMessage(" Loop2 interrupted");
//    			}
//
//    		}
//    	}
//    }
//
//
//    public static void main(String args[])
//        throws InterruptedException {
//
//        // Delay, in milliseconds before
//        // we interrupt MessageLoop
//        // thread (default one hour).
//        long patience = 1000  * 10;
//
//        // If command line argument
//        // present, gives patience
//        // in seconds.
//
//        if (args.length > 0) {
//            try {
//                patience = Long.parseLong(args[0]) * 1000;
//            } catch (NumberFormatException e) {
//                System.err.println("Argument must be an integer.");
//                System.exit(1);
//            }
//        }
//
//        threadMessage("Starting MessageLoop thread");
//        long startTime = System.currentTimeMillis();
//        Thread t = new Thread(new MessageLoop());
//        t.start();
//
//        Thread t2 = new Thread(new MessageLoop2());
//        t2.start();
//        t2.join();
//        threadMessage("Waiting for MessageLoop thread to finish");
//        // loop until MessageLoop
//        // thread exits
//        while (t.isAlive()) {
//            threadMessage("Still waiting...");
//            // Wait maximum of 1 second
//            // for MessageLoop thread
//            // to finish.
//            t.join(1000);
//            if (((System.currentTimeMillis() - startTime) > patience)
//                  && t.isAlive()) {
//                threadMessage("Tired of waiting!");
//                t.interrupt();
//                // Shouldn't be long now
//                // -- wait indefinitely
//                t.join();
//            }
//        }
//        threadMessage("Finally!");
//    }
//}
//
//
///************
//*************
//**************
//*/
//public class SleepMessages {
//    public static void main(String args[])
//        throws InterruptedException {
//        String importantInfo[] = {
//            "Mares eat oats",
//            "Does eat oats",
//            "Little lambs eat ivy",
//            "A kid will eat ivy too"
//        };
//
//        for (int i = 0;
//             i < importantInfo.length;
//             i++) {
//            //Pause for 4 seconds
//            Thread.sleep(4000);
//            //Print a message
//            System.out.println(importantInfo[i]);
//        }
//    }
//}
//
//UDW_CUST_PLN_ID:int64 {quote=none, null_field=''};
//BUS_EFF_DT:date {null_field=''};
//BUS_EXPIR_DT:date {null_field=''};
//TM_ATR_CD:string[5];
//TM_ATR_VALUE:string[1];
//CUST_PLN_ROW_IND:int32;
//
//
//
//readRecord(0);
//doTransfersFrom(0);
//
//if( (inputDone(0)!=1) ){
//	Output0.UDW_CUST_PLN_ID	=	Input0.UDW_CUST_PLN_ID	;
//	Output0.BUS_EFF_DT	=	Input0.BUS_EFF_DT	;
//	Output0.BUS_EXPIR_DT	=	Input0.BUS_EXPIR_DT	;
//	Output0.TM_ATR_CD	 =	Input0.TM_ATR_CD	;
//	Output0.TM_ATR_VALUE	=	Input0.TM_ATR_VALUE	;
//	Output0.CUST_PLN_ROW_IND	=	Input0.CUST_PLN_ROW_IND	;
//}
//
//doTransfersTo(0);
//writeRecord(0);
//
///***************
//*****************
//*****************/
//
//import java.util.Random;
//
//public class Producer implements Runnable {
//    private Drop drop;
//
//    public Producer(Drop drop) {
//        this.drop = drop;
//    }
//
//    public void run() {
//        String importantInfo[] = {
//            "Mares eat oats",
//            "Does eat oats",
//            "Little lambs eat ivy",
//            "A kid will eat ivy too"
//        };
//        Random random = new Random();
//
//        for (int i = 0;
//             i < importantInfo.length;
//             i++) {
//            drop.put(importantInfo[i]);
//            try {
//                Thread.sleep(random.nextInt(5000));
//            } catch (InterruptedException e) {}
//        }
//        drop.put("DONE");
//    }
//}
//
//
///****/
//
//public class ProducerConsumerExample {
//    public static void main(String[] args) {
//        Drop drop = new Drop();
//        (new Thread(new Producer(drop))).start();
//        (new Thread(new Consumer(drop))).start();
//    }
//}
//
///*******************/
//public class Drop {
//    // Message sent from producer
//    // to consumer.
//    private String message;
//    // True if consumer should wait
//    // for producer to send message,
//    // false if producer should wait for
//    // consumer to retrieve message.
//    private boolean empty = true;
//
//    public synchronized String take() {
//        // Wait until message is
//        // available.
//        while (empty) {
//            try {
//                wait();
//            } catch (InterruptedException e) {}
//        }
//        // Toggle status.
//        empty = true;
//        // Notify producer that
//        // status has changed.
//        notifyAll();
//        return message;
//    }
//
//    public synchronized void put(String message) {
//        // Wait until message has
//        // been retrieved.
//        while (!empty) {
//            try {
//                wait();
//            } catch (InterruptedException e) {}
//        }
//        // Toggle status.
//        empty = false;
//        // Store message.
//        this.message = message;
//        // Notify consumer that status
//        // has changed.
//        notifyAll();
//    }
//}
//
///*******************************/
//
//import java.util.Random;
//
//public class Consumer implements Runnable {
//    private Drop drop;
//
//    public Consumer(Drop drop) {
//        this.drop = drop;
//    }
//
//    public void run() {
//        Random random = new Random();
//        for (String message = drop.take();
//             ! message.equals("DONE");
//             message = drop.take()) {
//            System.out.format("MESSAGE RECEIVED: %s%n", message);
//            try {
//                Thread.sleep(random.nextInt(5000));
//            } catch (InterruptedException e) {}
//        }
//    }
//}
>>>>>>> cb3866775a23308bae8fd52663ae4e0bbc2db8fe
