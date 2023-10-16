package chanung.submit09.q02;

public class Fish {
    private String name;        /* 물고기 이름 */
    private int price;          /* 물고기 싯가 */

    public Fish() {
    }

    public Fish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name +
                ", 가치: " + price +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
