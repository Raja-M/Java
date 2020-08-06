# Concurrency

### Process and Thread

    Process :  Self contained execution Environment.
    
    Thread :   Thread exists within a process Provides execution envrionment.  Requires fewer resources. Every Thread has its own Call stack.
    
    Thread class implements the Runnable and have run method but it does not do anything. Need to call the start() to run the run method.
    Thread class defines a number of other methods with are related to Thread managment.
    
    We can define the task in run method and run it using thread class only but its better to dedicate the task to the class implments the Runnable 
    because then we cant extend any other classes if already extend the thread class and implmente run for the task.
    So we should use the class implments the Runnable and implement the run to execute the task required.
    
    
    sleep(4000)  not guarantee thread will be paused for given time . sleep can be interrupted by other threads also. Then sleep thows exception so that you know thread resumed.
    
    if thread is running or sleeping it can be interrupted by other if thread running for long time and no method like sleep to check for interruptions we can check for 
    interruptions manually like this
    
    ``if (Thread.interrupted()) {
    throw new InterruptedException();
    } `` 
    
    When Synchronize method is called its acquires intrinsic lock for that methods object so that other sysnchronized methods of that object will not be accessed by other threads lock will be released as soon as method exits.
  
  Wait method pauses the current execution of the thread and thread execution resume if its interrupted by notify or notifyall mehods of other threads 
  wait method throws interrupteException thread execution resume from the interruptException handler.''  
  
  
  
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}

Interrupt set the internal interrupt status when thread is running for longtime and if we want to check any interrupts happened we can call
Thread.interrupted to know that and this method will clear the interrupt status but if we want to know if a particular thread is interrupted 
or not and using isInterrupted method then this method will not be resetting the interrupt flag.

for (int i = 0; i < inputs.length; i++) {
    heavyCrunch(inputs[i]);
    if (Thread.interrupted()) {
        // We've been interrupted: no more crunching.
        return;
 }
 }
