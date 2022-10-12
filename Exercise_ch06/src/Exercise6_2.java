/*
[연습문제 6-2]
문제 6-1에서 정의한 SutdaCard 클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 */
class SutdaCard2 {

    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise6_2 {
    public static void main(String[] args) {

        SutdaCard2 card1 = new SutdaCard2(3, false);
        SutdaCard2 card2 = new SutdaCard2();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
