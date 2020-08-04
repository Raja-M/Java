# Concurrency

### Process and Thread

    Process :  Self contained execution Environment.
    
    Thread :   Thread exists within a process Provides execution envrionment.  Requires fewer resources. 
    
    Thread class implements the Runnable and have run method but it does not do anything. Need to call the start() to run the run method.
    Thread class defines a number of other methods with are related to Thread managment.
    
    We can define the task in run method and run it using thread class only but its better to dedicate the task to the class implments the Runnable 
    because then we cant extend any other classes if already extend the thread class and implmente run for the task.
    So we should use the class implments the Runnable and implement the run to execute the task required.
    
    
    sleep(4000)  not guarantee thread will be paused for given time . sleep can be interrupted by other threads also. Then sleep thows exception so that you know thread resumed.
    
    if thread is running or sleeping it can be interrupted by other if thread running for long time and no method like sleep to check for interruptions we can check for 
    interruptions manually like this
    
    if (Thread.interrupted()) {
    throw new InterruptedException();
    }  
    
      
