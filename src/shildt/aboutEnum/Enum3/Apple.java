package shildt.aboutEnum.Enum3;

/**
 * Created by Tony on 10.06.2016.
 */
public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price_;

    Apple(int price) {
        price_ = price;
    }

    Apple() { price_ = -1;}

    int getPrice() {
        return price_;
    }
}