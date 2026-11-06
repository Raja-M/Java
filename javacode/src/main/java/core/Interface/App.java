package core.Interface;



public class App {

    public static void main(String[] args) {
        MathTool mathTool = new MathTool ();


        double addRes = mathTool.add(10, 5);
        double subRes = mathTool.substract(10, 5);
        double mulRes = mathTool.multiply(10, 5);
        double divRes = mathTool.divide(10, 5);
        double modRes = mathTool.modulus(10, 5);
        double sqrRes = mathTool.square(10);

        System.out.println( "Addtional Results : " + addRes );
        System.out.println( "Substraction Results : " + subRes );
        System.out.println( "Multiplication Results : " + mulRes );
        System.out.println( "Division Results : " + divRes );
        System.out.println( "Modulus Results : " + modRes );
        System.out.println( "Square Results : " + sqrRes );

        System.out.println( "Pie Value : " + MathSpec.pieVal() );

        Transformer<String, Integer> stringLengthTransformer = (String s) -> s.length();
        System.out.println( "Length of 'Hello World' : " + stringLengthTransformer.transform("Hello World"));

        Transformer<Integer, String>  repeatStringTransformer = (Integer n) -> "Hello".repeat(n);
        System.out.println( "Repeat 'Hello' 3 times : " + repeatStringTransformer.transform(3));

        System.out.println(  "Half Value from Object : " + MathTool.half);
        System.out.println(  "Half Value from Interface : " + MathSpec.half);

        Clonable cnlb = new Base1();
        if (cnlb instanceof Clonable){
            System.out.println("Base1 is Clonable");
        } else {
            System.out.println("Base1 is not Clonable");
        }
        Base2 b2 = new Base2();
        if (b2 instanceof Clonable){
            System.out.println("Base2 is Clonable");
        } else {
            System.out.println("Base2 is not Clonable");
        }

        // Demonstrating the use of abstract class and interface
        /*
        Feature         Abstract Class                                          Interface
        -------------------------------------------------------------------------------------------------------------------
        Inheritance     Can extend only one class                               Can implement multiple interfaces
        Variables       Can have any variables (private, protected, state)      Only constants (public static final)
        Constructors    Has constructors                                        No constructors
        Methods         Abstract and concrete  (with bodies) methods            Mostly abstract,plus default/static methods
        Speed           Slightly faster execution                               Slightly slower (due to multiple lookups)
        */

        Report report = new Report ("Annual Report", "This is the content of the annual report.");
        System.out.println( " Report Content : " + report.getContent() ) ;
        report.display();
        report.print();

        Apple apple = new AppleStock();
        apple.printName();

        apple = new AppleFruit();
        apple.printName();

    }



}

class Base1 implements Clonable {


    // Class implementation
}
class Base2  {
    // Class implementati
}


abstract class Document {

    String title;

    Document( String title){
        this.title = title;
    }
    abstract String getContent();

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Content: " + getContent());
    }
}

class Report extends Document implements  Printable{

    String content;

    Report ( String title, String content){
        super(title);
        this.content = content;
    }

    @Override
    String getContent() {
        return content;
    }
    @Override
    public void print() {
        System.out.println("Printing Report: " + format( title));

    }
}

class AppleStock implements Apple {

    @Override
    public void printName() {
        System.out.println("Apple is Stock");
    }
}

class AppleFruit implements Apple {

    @Override
    public void printName() {
        System.out.println("Apple is Fruit");
    }
}
