public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) System.out.println("f는 Unit 클래스의 자손입니다.");
        if (f instanceof fightable) System.out.println("f는 fightable 인터페이스를 구현했습니다.");
        if (f instanceof movable) System.out.println("f는 movable 인터페이스를 구현했습니다.");
        if (f instanceof attackable) System.out.println("f는 attackable 인터페이스를 구현했습니다.");
        if (f instanceof Object) System.out.println("f는 Object 클래스의 자손입니다.");
    }
}

class Fighter extends Unit implements fightable {

    @Override
    public void move(int x, int y) {
    }

    @Override
    public void attack(Unit u) {
    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface fightable extends movable, attackable {
}

interface movable {
    void move(int x, int y);
}

interface attackable {
    void attack(Unit u);
}
