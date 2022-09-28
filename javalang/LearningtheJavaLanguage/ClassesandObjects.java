Object:
Encapsulation :  
	Hiding internal state and requiring all interaction to be performed through an object’s method’s is knows as data encapsulation.
Class : 
         Class is the blueprint from which individual objects are created.
Interface :
           You will need to add the public keyword to the beginning of the implemented interface methods.
           
           

Classes:
 
A class can only extend one parent. But can implement more than one interface.
Overloading :
Overloaded methods are differentiated by number and type of arguments passed  into the method.
But can not be differentiated by  return type.
 
 
Constructor:
If you don’t provide a constructor in the class declaration a no arguments default constructor will be created by the compiler. This default constructor will call the no argument constructor of the super class.
So you need to be careful will omitting the construction declaration and have to make sure your super class have no argument constructor.
If your class don’t have any super class it will have implicit super class i.e.  Object class which will have no argument constructor.
 
If  you call another form of constructor in the constructor declaration you should use this keyword to call another constructor  from constructor and that call should be first line in the constructor.
Methods :
Arbitrary number of arguments.
Shadowing field.  Fields can be referenced by this keyword.
Call by value, Call by reference.
Note: If you want to pass a method into a method, then use a lambda expression or a method reference. 
 
Methods Returning a Value from a Method :
This technique, called covariant return type, means that the return type is allowed to vary in the same direction as the subclass.
 
Using this with a Constructor:
If present, the invocation of another constructor must be the first line in the constructor.
 
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
 
Class Variables:
Any object can change the value of a class variable, but class variables can also be manipulated without creating an instance of the class.
 
Note: You can also refer to static fields with an object reference like 
myBike.numberOfBicycles
but this is discouraged because it does not make it clear that they are class variables. 
 
 
•Instance methods can access instance variables and instance methods directly.
•Instance methods can access class variables and class methods directly.
•Class methods can access class variables and class methods directly.
•Class methods cannot access instance variables or instance methods directly—they must use an object reference. Also, class methods cannot use the this keyword as there is no instance for this to refer to.
 
static final double PI = 3.141592653589793;
 
If the value of the constant in the outside world changes (for example, if it is legislated that pi actually should be 3.975), you will need to recompile any classes that use this constant to get the current value.
 
 
 
 
 
Initializing Fields:
A static initialization block is a normal block of code enclosed in braces, { }, and preceded by the static keyword. Here is an example:
static {
    // whatever code is needed for initialization goes here
}
A class can have any number of static initialization blocks, and they can appear anywhere in the class body. The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.
There is an alternative to static blocks — you can write a private static method:
 
class Whatever {
    public static varType myVar = initializeClassVariable();       
    private static varType initializeClassVariable() {
        // initialization code goes here
    }
}
 
Initializer blocks for instance variables look just like static initializer blocks, but without the static keyword:
{
    // whatever code is needed for initialization goes here
}
The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to share a block of code between multiple constructors.
A final method cannot be overridden in a subclass. This is discussed in the lesson on interfaces and inheritance. Here is an example of using a final method for initializing an instance variable:
 
class Whatever {
    private varType myVar = initializeInstanceVariable();       
    protected final varType initializeInstanceVariable() {
        // initialization code goes here
    }
}
 
Nested Classes :
Static nested classes do not have access to other members of the enclosing class. As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. (Recall that outer classes can only be declared public or package private.)
 
because an inner class (non static) is associated with an instance, it cannot define any static members itself.
 
 
Local Classes :
Local classes are non-static because they have access to instance members of the enclosing block. Consequently, they cannot contain most kinds of static declarations.
You cannot declare an interface inside a block; interfaces are inherently static
 
A local class can have static members provided that they are constant variables
 
 
Anonymous Classes :
You cannot declare constructors in an anonymous class.
 
 
 
Lambda Expressions :
Because the lambda expression does not introduce a new level of scoping.
local variables referenced from a lambda expression must be final or effectively final
 
 
Enum Types :
All enums implicitly extend java.lang.Enum. Because a class can only extend one parent.
The enum class body can include methods and other fields. The compiler automatically adds some special methods when it creates an enum. For example, they have a static values method that returns an array containing all of the values of the enum in the order they are declared.
The constructor for an enum type must be package-private or private access
 
 
Annotation:
To make the information in @ClassPreamble appear in Javadoc-generated documentation, you must annotate the @ClassPreamble definition with the @Documented annotation:
The predefined annotation types defined in java.lang are @Deprecated, @Override, and @SuppressWarnings.
 
Interfaces:
An interface can contain constant declarations. All constant values defined in an interface are implicitly public, static, and final.
 
All fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public.
All method declarations in an interface, including default methods, are implicitly public, so you can omit the public modifier.
 
Inheritance:
Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
 
An overriding method can also return a subtype of the type returned by the overridden method. This subtype is called a covariant return type.
 
object         overridenMethod( par , par)
subobject     overridenMehtod( par , par)
 
 
 
Static methods in interfaces are never inherited. 
 
	· Instance methods are preferred over interface default methods.
	· Methods that are already overridden by other candidates are ignored. This circumstance can arise when supertypes share a common ancestor.
	· If two or more independently defined default methods conflict, or a default method conflicts with an abstract method, then the Java compiler produces a compiler error. You must explicitly override the supertype methods.
	· Inherited instance methods from classes can override abstract interface methods.
	· Static methods in interfaces are never inherited.
 
you can also declare an entire class final. A class that is declared final cannot be subclassed. This is particularly useful, for example, when creating an immutable class like the String class.
 
 
Defining a Method with the Same Signature as a Superclass's Method		
 	Superclass Instance Method	Superclass Static Method
Subclass Instance Method	Overrides	Generates a compile-time error
Subclass Static Method	Generates a compile-time error	Hides
 
 
 
 
 
 
Abstract :
An abstract class may have static fields and static methods. You can use these static members with a class reference (for example, AbstractClass.staticMethod()) as you would with any other class.
 
Generics :
The most commonly used type parameter names are:
									· E - Element (used extensively by the Java Collections Framework)
									· K - Key
									· N - Number
									· T - Type
									· V - Value
									· S,U,V etc. - 2nd, 3rd, 4th types
For backward compatibility, assigning a parameterized type to its raw type is allowed:
Box<String> stringBox = new Box<>();
Box rawBox = stringBox;               // OK
 
But if you assign a raw type to a parameterized type, you get a warning:
 
Box rawBox = new Box();           // rawBox is a raw type of Box<T>
Box<Integer> intBox = rawBox;     // warning: unchecked conversion
 
You also get a warning if you use a raw type to invoke generic methods defined in the corresponding generic type:
 
Box<String> stringBox = new Box<>();
Box rawBox = stringBox;
rawBox.set(8);  // warning: unchecked invocation to set(T)
 
 
The warning shows that raw types bypass generic type checks, deferring the catch of unsafe code to runtime. Therefore, you should avoid using raw types.
  
 
 
 
Generic methods are methods that introduce their own type parameters.
 
Like Generic Classed you can have generic methods also.
Ex: 
public  static <K,V> boolean compare(Pair <K,V> p1, Pair<K,V> p2 ) { … }
 
Then you can call this method like 
obj.<Integer, String>compare(p1, p2)
or you can simple call without types also as simple method call 
obj.compare(p1,p2)  // p1,p2 data types will be determined based on how these objects are created.
 
This feature, known as type inference.
