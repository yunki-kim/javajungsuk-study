/*
[연습문제 6-18]
다음의 코드를 컴파일 하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.
 */
class MemberCall {

    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
    // static int cv2 = iv; // 라인 A

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); // 라인 B
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 라인 C
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); // 라인 D
    }

    void instanceMethod2() {
        staticMethod1(); // 라인 E
        instanceMethod1();
    }
}

public class Exercise6_18 {
    public static void main(String[] args) {

    }
}

/*
라인 A : 스태틱변수의 초기화에 인스턴스 변수 사용 불가
라인 B : 스태틱메서드에서는 인스턴스 변수 사용 불가
라인 D : 스태틱메서드에서는 인스턴스 메서드 사용 불가
 */
