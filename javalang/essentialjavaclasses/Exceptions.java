<<<<<<< HEAD
/*
checked exception:
	
	  java.io.FileNotFoundException.

Error : 
	Hardware failure.  Java.io.IOError.
	
Runtime Errors: ( unchecked Exceptions).
	Occurs because of the problem with logic in the code for example divided by zero
		Null assigned to the class . (NullPointerException)
		
		
try-with-resources statement, introduced in Java SE 7, is explained. The try-with-resources statement is particularly suited to situations that use Closeable resources, such as streams.

Try{
	……………..
}catch (IOException|SQLException ex) {
    logger.log(ex);
    throw ex;
}
Note: If a catch block handles more than one exception type, then the catch parameter is implicitly final. In this example, the catch parameter ex is final and therefore you cannot assign any values to 

The finally block always executes when the try block exits.
Note: If the JVM exits while the try or catch code is being executed, then the finally block may not execute. Likewise, if the thread executing the try or catch code is interrupted or killed, the finally block may not execute even though the application as a whole continues. 
 
Important: The finally block is a key tool for preventing resource leaks. When closing a file or otherwise recovering resources, place the code in a finally block to ensure that resource is always recovered.

Consider using the try-with-resources statement in these situations, which automatically releases system resources when no longer needed. 



Exceptions are suppressed  based on whether they are raised in try or finally blcok.

static String readFirstLineFromFile(String path) throws IOException {
    try (BufferedReader br =
                   new BufferedReader(new FileReader(path))) {
        return br.readLine();
    }
}

static String readFirstLineFromFileWithFinallyBlock(String path)
                                                     throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(path));
    try {
        return br.readLine();  // these exception are suppress if exception occurs in below block;
    } finally {
        if (br != null) br.close();
    }
}
In this example, if the methods readLine and close both throw exceptions, then the method readFirstLineFromFileWithFinallyBlock throws the exception thrown from the finally block; the exception thrown from the try block is suppressed. In contrast, in the example readFirstLineFromFile, if exceptions are thrown from both the try block and the try-with-resources statement, then the method readFirstLineFromFile throws the exception thrown from the try block; the exception thrown from the try-with-resources block is suppressed


Note: A try-with-resources statement can have catch and finally blocks just like an ordinary try statement. In a try-with-resources statement, any catch or finally block is run after the resources declared have been closed.


In other cases, however, it's better to let a method further up the call stack handle the exception

public void writeList() throws IOException, IndexOutOfBoundsException {

Remember that IndexOutOfBoundsException is an unchecked exception; including it in the throws clause is not mandatory. You could just write the following.

public void writeList() throws IOException {

You can also throw error as below  and create thow classes on your own by creating a new class by extending it  from java.lang.Throwable class.

throw someThrowableObject;

 If a client can reasonably be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception, make it an unchecked exception


*/
=======
//checked exception:
//
//	  java.io.FileNotFoundException.
//
//Error :
//	Hardware failure.  Java.io.IOError.
//
//Runtime Errors: ( unchecked Exceptions).
//	Occurs because of the problem with logic in the code for example divided by zero
//		Null assigned to the class . (NullPointerException)
//
//
//try-with-resources statement, introduced in Java SE 7, is explained. The try-with-resources statement is particularly suited to situations that use Closeable resources, such as streams.
//
//Try{
//	……………..
//}catch (IOException|SQLException ex) {
//    logger.log(ex);
//    throw ex;
//}
//Note: If a catch block handles more than one exception type, then the catch parameter is implicitly final. In this example, the catch parameter ex is final and therefore you cannot assign any values to
//
//The finally block always executes when the try block exits.
//Note: If the JVM exits while the try or catch code is being executed, then the finally block may not execute. Likewise, if the thread executing the try or catch code is interrupted or killed, the finally block may not execute even though the application as a whole continues.
//
//Important: The finally block is a key tool for preventing resource leaks. When closing a file or otherwise recovering resources, place the code in a finally block to ensure that resource is always recovered.
//
//Consider using the try-with-resources statement in these situations, which automatically releases system resources when no longer needed.
//
//
//
//Exceptions are suppressed  based on whether they are raised in try or finally blcok.
//
//static String readFirstLineFromFile(String path) throws IOException {
//    try (BufferedReader br =
//                   new BufferedReader(new FileReader(path))) {
//        return br.readLine();
//    }
//}
//
//static String readFirstLineFromFileWithFinallyBlock(String path)
//                                                     throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader(path));
//    try {
//        return br.readLine();  // these exception are suppress if exception occurs in below block;
//    } finally {
//        if (br != null) br.close();
//    }
//}
//In this example, if the methods readLine and close both throw exceptions, then the method readFirstLineFromFileWithFinallyBlock throws the exception thrown from the finally block; the exception thrown from the try block is suppressed. In contrast, in the example readFirstLineFromFile, if exceptions are thrown from both the try block and the try-with-resources statement, then the method readFirstLineFromFile throws the exception thrown from the try block; the exception thrown from the try-with-resources block is suppressed
//
//
//Note: A try-with-resources statement can have catch and finally blocks just like an ordinary try statement. In a try-with-resources statement, any catch or finally block is run after the resources declared have been closed.
//
//
//In other cases, however, it's better to let a method further up the call stack handle the exception
//
//public void writeList() throws IOException, IndexOutOfBoundsException {
//
//Remember that IndexOutOfBoundsException is an unchecked exception; including it in the throws clause is not mandatory. You could just write the following.
//
//public void writeList() throws IOException {
//
//You can also throw error as below  and create thow classes on your own by creating a new class by extending it  from java.lang.Throwable class.
//
//throw someThrowableObject;
//
// If a client can reasonably be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception, make it an unchecked exception
//
//
>>>>>>> cb3866775a23308bae8fd52663ae4e0bbc2db8fe
