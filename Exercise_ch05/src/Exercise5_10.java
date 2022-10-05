/*
[연습문제 5-10]
다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
(1)에 알맞은 코드를 넣어서 완서하시오.
 */
public class Exercise5_10 {
    public static void main(String[] args) {

        char[] abcCode = { '`','~','!','@','#','$','%','^','&','*', '(', ')',
                '-', '_','+','=','|','[',']','{', '}',';',':',',','.','/'};
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            // (1)
            if (ch >= 'a' && ch <= 'z') {
                result += abcCode[ch - 'a'];
            } else if (ch >= '0' && ch <= '9') {
                result += numCode[ch - '0'];
            }
        }
        System.out.println("src : " + src);
        System.out.println("result : " + result);
    }
}
