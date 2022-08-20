/*
[연습문제 3-9]
다음은 문자형 변수 ch가 영문자이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.
(1)에 알맞은 코드를 넣으시오
 */

public class Exercise3_9 {
    public static void main(String[] args) {

        char ch = 'z';
        // boolean b = ( (1) );
        boolean b = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');

        System.out.println(b);
    }
}
