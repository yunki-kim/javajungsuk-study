public class ConstructorTest {
    public static void main(String[] args) {

        CData1 d1 = new CData1();
        // CData2 d2 = new CData2(); // 컴파일 에러 발생
    }
}

class CData1 {

    int value;
}

class CData2 {

    int value;

    CData2(int x) {
        value = x;
    }
}
