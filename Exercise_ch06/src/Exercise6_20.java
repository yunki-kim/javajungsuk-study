import java.util.Arrays;

/*
[연습문제 6-20]
다음과 같이 정의된 메서드를 작성하고 테스트하시오.

메서드명 : shuffle
기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다음 처리한 배열을 반환한다.
반환타입 : int[]
매개변수 : int[] arr
 */
public class Exercise6_20 {

    static int[] shuffle(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int randomNum1 = (int)(Math.random() * arr.length);
            int randomNum2 = (int)(Math.random() * arr.length);

            int tmp = arr[randomNum1];
            arr[randomNum1] = arr[randomNum2];
            arr[randomNum2] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
