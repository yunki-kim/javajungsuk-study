/*
[연습문제 6-7]
문제 6-6에서 작성한 클래스메서드 getDistance()를 MyPoint 클래스의 인스턴스 메서드로 정의하시오.
 */
class MyPoint {

    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
    }
}

public class Exercise6_7 {
    public static void main(String[] args) {

        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2, 2));
    }
}
