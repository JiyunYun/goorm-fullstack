import java.util.Iterator;
import java.util.NoSuchElementException;

// Singly LinkedList
public class MyLinkedList<E> {
    private Node<E> head; // 리스트의 가장 첫 번째 노드를 가리키는 포인트
    private Node<E> tail; // 리스트의 가장 마지막 노드를 가리키는 포인트

    public int size; // 연결된 노드의 총 갯수

    // 생성자
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // inner static class
    private static class Node<E> {
        private E item;
        private Node<E> next;

        // 생성자
        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node<E> search(int index) {
        // head(처음)부터 차례로 index 까지 검색
        Node<E> n = head;
        for (int i = 0; i < index; i++) {
            n = n.next; // next 필드의 값(다음 노드 주소)을 재대입 하면서 순차적으로 노드를 탐색
        }

        return n;
    }

    // 마지막 위치에 노드 추가 (성공하면 true, 실패하면 false를 반환)
    public boolean add(E value) {
        // 1. 먼저 가장 뒤의 노드를 가져옴
        Node<E> last = tail;

        // 2. 새 노드 생성 (맨 마지막 노드 추가니까 next는 null)
        Node<E> newNode = new Node<>(value, null);

        // 3. 노드가 하나 추가되었으니 size를 늘림
        size++;

        // 4. 맨 뒤에 노드가 추가되었으니 tail을 업데이트
        tail = newNode;

        if (last == null) {
            // 5. 만일 최초로 노드가 add 된 것이면 head와 tail이 가리키는 노드는 같음
            head = newNode;
        } else {
            // 6. 최초 추가가 아니라면 last 변수(추가되기 전 마지막이었던 노드)에서 추가된 새 노드를 가리키도록 업데이트
            last.next = newNode;
        }

        return true;
    }

    // 맨 앞 노드를 삭제 (삭제한 노드의 값은 반환)
    public E deleteFirst() {
        // 1. 만약 삭제할 노드가 아무것도 없으면 에러
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        // 2. 삭제될 노드의 데이터를 백업
        E delValue = head.item;

        // 3. 두 번째 노드를 임시 저장
        Node<E> first = head.next;

        // 4. 첫 번째 노드와 내부 요소를 모두 삭제
        head.item = null;
        head.item = null;

        // 5. head가 다음 노드를 가리키도록 업데이트
        head = first;

        // 6. 노드가 하나 감소되었으니 size를 줄임
        size--;

        // 7. 만일 리스트의 유일한 값을 삭제해서 빈 리스트가 될 경우, tail도 null처리
        if (head == null) {
            tail = null;
        }

        // 8. 마지막으로 삭제된 노드의 값을 반환
        return delValue;
    }

    // index 위치의 노드를 삭제 (삭제한 노드의 값은 반환)
    public E delete(int index) {
        // 1. index가 0보다 작거나 size보다 크거나 같은 경우 에러 발생
        // size와 같을 경우 빈 공간을 가리키는 것이므로
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // 2. index가 0이면(맨 앞 노드를 삭하면) deleteFirst 메서드 실행하고 리턴
        if (index == 0) {
            return deleteFirst();
        }

        // 3. 삭제할 위치의 이전 노드 저장
        Node<E> prevNode = search(index - 1);

        // 4. 삭제할 위치의 노드 저장
        Node<E> delNode = search(index);

        // 5. 삭제할 위치의 다음 노드 저장
        Node<E> nextNode = search(index + 1);

        // 6. 삭제될 노드의 데이터를 백업
        E delValue = delNode.item;

        // 7. 삭제 노드의 내부 요소를 모두 삭제
        delNode.item = null;
        delNode.next = null;

        // 8. 노드가 하나 감소되었으니 size를 줄임
        size--;

        // 9. 이전 노드가 다음 노드를 가리키도록 업데이트
        prevNode.next = nextNode;

        // 10. 마지막으로 삭제된 노드의 데이터를 반환
        return delValue;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return search(index).item;
    }

//    public Iterator iterator() {
//        return new MyLinkedListIterator();
//    }
//
//    class MyLinkedListIterator implements Iterator<E> {
//        Node<E> n;
//
//        // 생성자
//        public MyLinkedListIterator() {
//            n = head;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return n != null;
//        }
//
//        @Override
//        public E next() {
//            if (!hasNext()) {
//                throw new NoSuchElementException();
//            }
//
//            E value = n.item;
//            n = n.next;
//
//            return value;
//        }
//    }
}
