class MyMath2 {

    double a, b;

    // 인스턴스 메서드
    double add() { return  a + b; }
    double subtract() { return  a - b; }
    double multiply() { return  a * b; }
    double divide() { return  a / b; }

    // 클래스 메서드
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
}

public class MyMathTest2 {
    public static void main(String[] args) {

        // 클래스 메서드
        System.out.println(MyMath2.add(200, 100));
        System.out.println(MyMath2.subtract(200, 100));
        System.out.println(MyMath2.multiply(200, 100));
        System.out.println(MyMath2.divide(200, 100));

        MyMath2 mm = new MyMath2();
        mm.a = 200;
        mm.b = 100;
        // 인스턴스 메서드
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());

    }
}
