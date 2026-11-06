package core.Interface;

public class MathTool implements MathSpecs  {




    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply( double a, double b){
        return a * b;
    }

    @Override
    public double divide( double a, double b){
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    @Override
    public double modulus(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        //MathSpecs.super.square(a);
        return a % b;

       // calling default method from MathSpec interface
    }


}




