package javafeatures;

interface Drawable {

    public void draw() ;

}

public class LambdaExpression {

    public static void main(String[] args) {
        int width = 10;
        Drawable d =  () -> {
                System.out.println(" Drawing widht : " + width);
        };
        d.draw();

        MyFunctionalInterface myFunctionalInterface = (a, b) -> a + b;
        System.out.println(" Sum : " + myFunctionalInterface.operation(10, 20) );
        
    }


}


interface MyFunctionalInterface {
    public int operation(int a, int b);
}