class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv; // 클래스 변수는 인스턴스 변수 사용 불가
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); // 클래스 메서드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv); // 객체 생성 후 인스턴스 변수 사용 가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); // 클래스 메서드에서 인스턴스 메서드 사용 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 객체 생성 후 인스턴스 메서드 사용 가능
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
