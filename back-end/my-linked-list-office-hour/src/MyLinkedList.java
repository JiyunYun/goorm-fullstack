import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

  protected Node<T> head;
  protected int size = 0;

  public void add(T data) {
    Node<T> node = new Node<T>(data);
    if(this.size == 0) {
      this.head = node;
    } else {
      Node<T> current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(node);
    }
    this.size++;
  }

  public T get(int index) {
    if(index < 0 || this.size <= index) throw new IndexOutOfBoundsException();

    Node<T> current = this.head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }

    return current.getData();
  }

  public void delete(int index) {
    if(index < 0 || this.size <= index) throw new IndexOutOfBoundsException();
    //index =0,1, 2
    //data: 1, 2, 3
    if(index == 0) {
      head = head.getNext();
    } else {
      Node<T> current = this.head;
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      current.setNext(current.getNext().getNext());
    }
    this.size--;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private Node<T> current = head;
      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public T next() {
        if(!hasNext()) {
          throw new NoSuchElementException();
        }
        T data = current.getData();
        current = current.getNext();
        return data;
      }
    };
  }
}
