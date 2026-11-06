package core.Interface;

public interface MathSpec {
    //Interface constants
    //Interface variables are implicitly public, static, and final
    // its like public static final double half = 0.5;
    double half = 0.5;

    // simple implicit public abstract methods
    double add(double a, double b);
    double substract(double a, double b);

    // default method with implementation
    // default methods can be overridden in implementing classes
    // defaults methods  can be called from implementing classes using super keyword like MathSpec.super.square(a);

    default double square(double a) {
        logMessage("Calculating square of " + a);
        return a * a;
    }

    // static method with implementation
    // static methods cant be overridden in implementing classes
    static double pieVal() {
        return 3.14159;
    }

    // private methods not visible to implementing classes, can be used in default methods
    private void logMessage(String message) {
        System.out.println("Log: " + message);
    }

}

interface MathSpec2  extends  MathSpec{

    // simple implicit public abstract methods
    double multiply(double a, double b);
    double divide(double a, double b);


}
//interface  MathSpecs extends  MathSpec2 , mathSpec {
interface  MathSpecs extends  MathSpec2  {

    double modulus(double a, double b);

    // This interface inherits methods from both MathSpec and MathSpec2


}

@FunctionalInterface
interface Transformer<T, R> {


    R transform(T t);

    // 2. PUBLIC OBJECT CLASS OVERRIDES
    // These do NOT count against the single abstract method count limit.
    @Override
    boolean equals(Object obj);

    @Override
    String toString();

    // 3. DEFAULT METHOD
    // Allows you to add fallback instance logic without breaking classes that use it.
    default <V> Transformer<T, V> andThen(Transformer<R, V> after) {
        return (T data) -> {
            logAction("andThen Pipeline"); // Using the private method here!
            return after.transform(this.transform(data));
        };
    }
    // 4. SECOND DEFAULT METHOD
    // You can have as many default method pipelines as you want.
    default Transformer<T, T> identity() {
        return (T data) -> data;
    }

    // 5. STATIC METHOD
    // Behaves exactly like a standard global utility helper method.
    static <In> Transformer<In, String> toStaticString(String staticText) {
        return (In data) -> staticText;
    }
    // 6. PRIVATE METHOD (Java 9+)
    // Perfect for cleaning up and encapsulating shared code inside default hooks.
    private void logAction(String phase) {
        System.out.println("[Log Entry] Validation executed at phase: " + phase);
    }
}

//Marker interface is an interface with no methods or fields.
// It is used to indicate that a class has a certain property or should be treated in a certain way.
// For example, the Serializable interface in Java is a marker interface that indicates that a class can be serialized.
interface Clonable{}

//Interface vs Abstract class
interface Printable {
    void print();

    default  String format(String text){
        return "Formatted: [ " + text + " ]";
    }
}

//Polymarphism with interface
interface Apple{
    void printName();
}

