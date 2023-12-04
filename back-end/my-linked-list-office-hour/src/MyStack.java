import java.util.NoSuchElementException;

public class MyStack<T> extends MyLinkedList<T> {

  public void push(T data) {
    Node<T> node = new Node<>(data);
    if(this.head == null) {
      this.head = node;
    } else {
      node.setNext(this.head);
      this.head = node;
    }
    this.size++;
  }

  public T pop() {
    if(this.head == null) {
      throw new NoSuchElementException();
    }
    T data = this.head.getData();
    this.head = this.head.getNext();
    this.size--;
    return data;
  }
}
