package chanung.submit09.q01;

// lombok 라이브러리를 설치한다면?
//@Constructor
//@Getter
//@Setter
public class Product {
    private String name;    /* 제품명 */
    private int price;      /* 가격 */

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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
