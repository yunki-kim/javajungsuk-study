/*
[연습문제 6-8]
다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
 */
class PlayingCard {

    int kind;
    int num;
    static int width;
    static int height;

    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }
}

public class Exercise6_8 {
    public static void main(String[] args) {

        PlayingCard card = new PlayingCard(1, 1);
    }
}

/*
클래스 변수 : width, height
인스턴스 변수 : kind, num
지역변수 : k, n, card
 */
