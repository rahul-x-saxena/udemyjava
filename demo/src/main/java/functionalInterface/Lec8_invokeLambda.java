package functionalInterface;

interface A{
    void m1();
}

public class Lec8_invokeLambda {

    public static void main(String[] args) {
        NormalImplementation obj = new NormalImplementation();
        A a = () -> System.out.println("Lambda Implementation");
        obj.m1();
        a.m1();
    }
}

class NormalImplementation implements A{

    @Override
    public void m1() {
        System.out.println("Normal Implementation");
    }
}
