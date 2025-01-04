package interfaceexample;

public class SampleClass implements SampleInterface1,SampleInterface2{
    @Override
    public void demo1() {
        System.out.println("abc is:"+SampleInterface1.abc);
        System.out.println("Demo1 implementation inside SampleClass.");
    }

    @Override
    public void demo2() {
        System.out.println("xyz is:"+SampleInterface1.xyz);
        System.out.println("Demo2 implementation inside SampleClass.");
    }

    @Override
    public void Sample() {
        System.out.println("pqr is:"+SampleInterface2.pqr);
        System.out.println("Sample implementation inside SampleClass.");
    }
}
