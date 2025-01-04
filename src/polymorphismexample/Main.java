package polymorphismexample;

public class Main {
    public static void main(String[] args) {
        SampleClass s1= new SampleClass();
        s1.sum(12,3);
        s1.sum(1,2,3);
        s1.sum(2.3,4.5);
        s1.sum(2.5f,7.5f);
    }
}
