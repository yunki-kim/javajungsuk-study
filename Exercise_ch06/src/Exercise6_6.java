/*
[연습문제 6-6]
두 점 사이의 거리를 계산하는 getDistance()를 완성하시오.
 */
public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
    }

    public static void main(String[] args) {

        System.out.println(getDistance(1, 1, 2, 2));
    }
}
