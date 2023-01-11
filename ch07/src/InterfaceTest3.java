public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

interface I2 {
    void methodB();
}

class A3 {
    void methodA() {
        I2 i = InstanceManager.getInstance();
        i.methodB();
    }
}

class B3 implements I2 {
    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B3();
    }
}
