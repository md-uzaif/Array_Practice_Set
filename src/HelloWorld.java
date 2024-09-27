
public interface HelloWorld {
    public void m1(int a, int b);
}

class Demo1 implements HelloWorld {
    @Override
    public void m1(int a, int b) {
        System.out.println("The sum: " + (a + b));
    }
}

class C {

    public static void main(String[] args) {
        System.out.println("Assalamu alaikum");

        HelloWorld demoInstance = new Demo1();

        demoInstance.m1(100, 200);
    }
}

