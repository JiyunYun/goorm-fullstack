public class Main {
  public static void main(String[] args) {
//    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
//    myLinkedList.add("a");
//    myLinkedList.add("b");
//    myLinkedList.add("c");
//
//    System.out.println(myLinkedList.get(0));
//    System.out.println(myLinkedList.get(1));
//    System.out.println(myLinkedList.get(2));
//
//    myLinkedList.delete(1);
//
//    for (String data: myLinkedList) {
//      System.out.println(data);
//    }

    MyStack<Integer> myStack = new MyStack<>();
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);

    for (Integer data: myStack) {
      System.out.println(data);
    }

//    MyQueue<Integer> myQueue = new MyQueue<>();
//    myQueue.enQueue(1);
//    myQueue.enQueue(2);
//    myQueue.enQueue(3);
//
//    System.out.println(myQueue.deQueue());
//    System.out.println(myQueue.deQueue());
//    System.out.println(myQueue.deQueue());

  }
}