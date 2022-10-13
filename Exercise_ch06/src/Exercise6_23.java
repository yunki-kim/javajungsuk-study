import java.util.Arrays;

/*
[연습문제 6-23]
다음과 같이 정의된 메서드를 작성하고 테스트하시오.

메서드명 : max
기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
       만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
반환타입 : int
매개변수 : int[] arr
 */
public class Exercise6_23 {

    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{}));
    }
}
