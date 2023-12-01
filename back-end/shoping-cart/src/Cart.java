import java.util.Map.Entry;
import java.util.HashMap;

public class Cart {
    // Key(Product: 상품), Value(Integer: 수량)
    HashMap<Product, Integer> items;

    // 생성자
    Cart() {
        this.items = new HashMap<>();
    }

    public void showItems() {
        System.out.println();
        System.out.println("[ 장바구니에 담긴 상품 목록 ]");
        for (Entry<Product, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getValue() + "개");
        }
    }

    public void addProduct(Product product, int n) {
        System.out.println();
        System.out.println("[ Add Product ]");
        System.out.println(product.getName() + " " + n + "개 담기");

        if (this.items.isEmpty()) { // 장바구니가 아예 비어 있으면
            this.items.put(product, n); // 상품과 수량 n개를 새로 추가
        } else { // 장바구니가 비어 있지 않으면
            if (this.items.get(product) != null) { // 장바구니에 해당 상품이 이미 담겨 있으면
                this.items.put(product, this.items.get(product) + n); // 수량만 n개 더 추가
            } else { // 장바구니에 해당 상품이 담겨 있지 않으면
                this.items.put(product, n); // 상품과 수량 n개를 새로 추가
            }
        }

        System.out.println("----- Success -----");
    }

    public void removeProduct(Product product, int n) {
        System.out.println();
        System.out.println("[ Remove Product ]");
        System.out.println(product.getName() + " " + n + "개 빼기");

        if (this.items.isEmpty()) { // 장바구니가 아예 비어 있으면
            System.out.println("----- Failed -----");
            System.out.println("Reason: 장바구니가 비어 있습니다.");
            return;
        } else { // 장바구니가 비어 있지 않으면
            if (this.items.get(product) == null) { // 장바구니에 해당 상품이 담겨 있지 않으면
                System.out.println("----- Failed -----");
                System.out.println("Reason: 장바구니에 해당 상품이 존재하지 않습니다.");
                return;
            } else if (n > this.items.get(product)) { // 장바구니에 담겨 있는 수량보다 삭제하려는 수량이 많으면
                System.out.println("----- Failed -----");
                System.out.println("Reason: 장바구니에 담겨 있는 수량보다 더 많이 뺄 수 없습니다. 다시 입력해주십시오.");
                return;
            } else if (this.items.get(product).equals(n)) { // 장바구니에 담겨 있는 수량과 삭제하려는 수량이 같으면
                this.items.remove(product); // 해당 상품을 장바구니에서 삭제
            } else { // 장바구니에 담겨 있는 수량보다 삭제하려는 수량이 적으면
                this.items.put(product, this.items.get(product) - n); // 수량 n개 삭제
            }
        }

        System.out.println("----- Success -----");
    }
}
