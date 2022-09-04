/*
[연습문제 4-4]
1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
 */

public class Exercise4_4 {
    public static void main(String[] args) {

        int num = 0;
        int sign = 1;
        int sum = 0;

        for (int i = 1 ; sum < 100 ; i++) {
            num = sign * i;
            sum += num;
            sign = -sign;
        }

        System.out.println(num);

    }
}
