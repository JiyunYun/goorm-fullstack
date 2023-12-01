import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class CartApp {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();

        // TO DO: 상품 클래스를 생성하여 상품 목록에 넣는다.
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(0, "우유", 3000));
        products.add(new Product(1, "화장지", 10000));
        products.add(new Product(2, "사과", 800));
        products.add(new Product(3, "계란", 5000));
        products.add(new Product(4, "라면", 2000));

        for (Product product : products) {
            productSet.add(product);
        }

        // 상품 목록 확인
        System.out.println("[ 고유한 상품 목록 ]");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice() + "원");
        }

        // 장바구니 생성
        Cart myCart = new Cart();

        // TO DO: 상품을 장바구니에서 제거
        myCart.removeProduct(products.get(0), 1);

        // TO DO: 상품을 장바구니에 추가
        myCart.addProduct(products.get(0), 1);
        myCart.addProduct(products.get(1), 3);
        myCart.addProduct(products.get(2), 1);
        myCart.addProduct(products.get(3), 5);
        myCart.addProduct(products.get(4), 2);

        // TO DO: 장바구니에 현재 담긴 상품들을 출력 (상품 이름, 각 상품의 갯수)
        myCart.showItems();

        // TO DO: 상품을 장바구니에서 제거
        myCart.removeProduct(products.get(0), 1);
        myCart.removeProduct(products.get(0), 1);
        myCart.showItems();

        myCart.removeProduct(products.get(1), 4);
        myCart.removeProduct(products.get(1), 3);
        myCart.removeProduct(products.get(3), 2);
        myCart.showItems();
    }
}