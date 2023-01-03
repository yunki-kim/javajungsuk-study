public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv2 tv = new Tv2();
        Computer2 com = new Computer2();
        Audio2 audio = new Audio2();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);

        b.summary();
    }
}

class Product2 {
    int price;
    int bonusPoint;

    public Product2() {
        price = 0;
    }

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;

    static Product2[] item = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을(를) 구매하셨습니다.");
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();

        for (int j = 0; j < item.length; j++) {
            if (item[j] == null) break;
            sum += item[j].price;
            itemList.append(item[j]).append(", ");
        }
        System.out.println("구매하신 제품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구매하신 제품은 " + itemList + "입니다.");
    }
}
