





# Java 9 
  
      Interfaces :
          added private methods in interfaces
          public interface Series {
              int MAX = 10 //  this will be static final
              
              int getNext();
              
              default void printStuff(){
                 System.out.println( " Live from New york. Its Saturday night " ) ;
                 print moreStuff();
              }
              
              private void printMoreStuff(){
              
              }
          }
         
         
