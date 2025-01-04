package polymorphismexample;

public class SampleClass {
    public void sum(int a, int b){
        System.out.println("sum of two numbers : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three numbers : "+(a+b+c));
    }

    public void sum(double a, double b){
        System.out.println("sum of two doubles numbers : "+(a+b));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float numbers : "+(a+b));
    }

}
