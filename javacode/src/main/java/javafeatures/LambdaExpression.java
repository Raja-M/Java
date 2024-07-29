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
    }

}
