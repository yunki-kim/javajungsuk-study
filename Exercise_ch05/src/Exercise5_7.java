/*
[연습문제 5-7]
문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
보유한 동전의 개수로 거스름돈을 지불할 수 없으면, '거스름 돈이 부족합니다.'라고 출력하고 종료한다.
지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
 */
public class Exercise5_7 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);
        }

        int money = Integer.parseInt(args[0]);
        System.out.println("money : " + money);

        int[] coinUnit = {500, 100, 50, 10};
        int[] coin = {5, 5, 5, 5};

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;

            // (1)
            coinNum = money / coinUnit[i];
            if (coin[i] > coinNum) {
                coin[i] -=  coinNum;
            } else {
                coinNum = coin[i];
                coin[i] = 0;
            }
            money -= coinNum * coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + coinNum);
        }

        if (money > 0) {
            System.out.println("거스름 돈이 부족합니다.");
            System.exit(0);
        }
        System.out.println("=남은 동전의 개수=");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }
    }
}
