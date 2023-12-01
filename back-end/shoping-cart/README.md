**Goormthon Training Assignment #9**
# 장바구니 기능 구현하기

쇼핑몰에서 자주 사용하는 기능인 '장바구니' 기능을 Java로 구현합니다.<br/>
`HashSet`을 사용하여 상품 목록을 만들고, `HashMap`을 사용하여 장바구니에 상품을 담습니다.

구현하기 위해서는 다음과 같은 클래스가 필요합니다.

- **상품**
  - 상품의 key, 이름, 가격을 필드로 가짐
  - `equals()` 및 `hashCode()` 함수를 `Override` 해야 함
  - `HashSet`을 사용할 때 중복된 상품이 상품 목록에 들어가지 않게 위의 함수들이 사용되어야 함

- **장바구니**
  - `items`를 가지고 있음

- **기타 다음과 같은 함수를 가지고 있어야 함**
  - `showItems()`
  - `addProduct()`
  - `removeProduct()`

</br>
<p>장바구니 어플리케이션은 다음과 같은 기능을 제공해야 합니다.</p>

1. 상품을 입력하여 상품 목록을 구성합니다.
2. 장바구니에 상품을 담습니다. 이때, 상품을 몇 개 담을 것인지 또한 명시되어야 합니다.
  - (ex) 우유 2개 담기, 사과 1개 담기, ...
3. 장바구니에서 상품을 제거합니다. 이때 몇 개의 상품을 뺄 것인지 명시되어야 합니다.
  - (ex) 우유 2개 빼기, ...
4. 장바구니에 담겨있는 상품들의 이름과 수량을 출력해야 합니다.

<br/>
<p>다음과 같은 코드에서 정상적으로 돌아가게끔 구성합니다.</p>

```java
public class CartApp {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        // TO DO: 상품 클래스를 생성하여 상품 목록에 넣는다.
        
        // 상품 목록 확인
        System.out.println("고유한 상품 목록: ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }
        
        // 장바구니 생성
        Cart myCart = new Cart();
        
        // TO DO: 상품을 장바구니에 추가
        // TO DO: 상품을 장바구니에서 제거
        // TO DO: 장바구니에 현재 담긴 상품들을 출력 (상품 이름, 각 상품의 갯수)
    }
}
```

#### 수행 기간
2023년 11월 29일 ~ 12월 1일 (3일)

#### 하위 과제
I/O 스트림을 사용하여 `csv` 파일로부터 상품 목록을 불러올 수 있도록 장바구니 앱을 수정

#### 참고
- [Java] HashMap, HashSet 이란? - (5) HashMap과 HashSet의 차이
https://siahn95.tistory.com/96
- [Java] equals와 hashCode 함수<br/>
https://mangkyu.tistory.com/101