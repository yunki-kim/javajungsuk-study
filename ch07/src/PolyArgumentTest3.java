import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv3 tv = new Tv3();
        Computer3 com = new Computer3();
        Audio3 audio = new Audio3();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();

        System.out.println("=============");
        b.refund(com);
        b.summary();
    }
}

class Product3 {
    int price;
    int bonusPoint;

    public Product3() {
        price = 0;
    }

    Product3(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv3 extends Product3 {
    Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer3 extends Product3 {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio3 extends Product3 {
    Audio3() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer3 {
    int money = 1000;
    int bonusPoint = 0;

    Vector item = new Vector();

    void buy(Product3 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을(를) 구매하셨습니다.");
    }

    void refund(Product3 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을(를) 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int j = 0; j < item.size(); j++) {
            Product3 p = (Product3) item.get(j);
            sum += p.price;
            itemList.append((j == 0) ? "" + p : ", " + p);
        }
        System.out.println("구매하신 제품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구매하신 제품은 " + itemList + "입니다.");
    }
}
