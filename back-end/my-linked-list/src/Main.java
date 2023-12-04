public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.add("value-0");
        linkedList.add("value-1");
        linkedList.add("value-2");
        linkedList.add("value-3");
        linkedList.add("value-4");

        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(3));

        System.out.println();
        for (int i = 0; i < linkedList.size; i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println();
        linkedList.delete(2);
        for (int i = 0; i < linkedList.size; i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println();
        linkedList.delete(0);
        for (int i = 0; i < linkedList.size; i++) {
            System.out.println(linkedList.get(i));
        }
    }
}