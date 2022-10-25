class FinalCard {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    FinalCard(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    FinalCard() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {

        FinalCard c = new FinalCard("HEART", 10);
        // c.NUMBER = 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
