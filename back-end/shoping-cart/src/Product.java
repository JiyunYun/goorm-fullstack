import java.util.HashSet;

public class Product {

    private int key;
    private String name;
    private int price;

    // 생성자
    Product(int key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (getClass() == obj.getClass()) {
            return true;
        }

        Product p = (Product) obj;
        return (this.getKey() == p.getKey());
    }

    @Override
    public int hashCode() {
        final int PRIME = 88;
        return PRIME * getKey();
    }
}
