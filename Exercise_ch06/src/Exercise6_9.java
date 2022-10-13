/*
[연습문제 6-9]
다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
 */
class Marine {

    int x = 0, y = 0; // 위치좌표
    int hp = 60;
    int weapon = 6;
    int armor = 0;

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Exercise6_9 {
    public static void main(String[] args) {

    }
}

/*
weapon, armor : 모든 병사의 공격력과 방어력은 동일해야하기 때문에.
weaponUp(), armorUp() : static 변수에 대한 작업을 하는 메서드이기 때문에.
 */
