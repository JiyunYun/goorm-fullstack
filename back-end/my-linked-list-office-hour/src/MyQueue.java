import java.util.NoSuchElementException;

public class MyQueue<T> extends MyLinkedList<T> {

  // 1(head), 2, 3, 4, 5(tail)
  private Node<T> tail;

  // 1(head), 2(tail)
  public void enQueue(T data) {
    Node<T> node = new Node<>(data);
    if(this.head == null) {
      this.head = node;
    } else {
      this.tail.setNext(node);
    }
    this.tail = node;
    this.size++;
  }

  // 1(head, tail)
  public T deQueue() {
    if(this.head == null) {
      throw new NoSuchElementException();
    }

    T data = this.head.getData();
    this.head = this.head.getNext();
    //data = 1
    //this.head = null
    //this.tail = 1
    if(this.head == null) {
      this.tail = null;
    }

    this.size--;
    return data;
  }
}
