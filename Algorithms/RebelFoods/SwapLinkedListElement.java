package RebelFoods;

/**
 * @author Bhaskar Singh
 * @date 6/19/2021 5:50 PM
 */
public class SwapLinkedListElement {

    Node head;

    static class Node {
        int data;

        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    static SwapLinkedListElement insert(SwapLinkedListElement linkedList, int data) {
        Node node = new Node(data);
        node.next = null;

        if(linkedList.head == null) {
            linkedList.head = node;
        } else {
            Node temp = linkedList.head;
            Node previous = linkedList.head;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = temp;
            temp.next = node;
        }
        return linkedList;
    }

    public static void print(SwapLinkedListElement linkedList) {
        Node node = linkedList.head;
        while(node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static SwapLinkedListElement delete(SwapLinkedListElement linkedList, int data) {
        Node node = linkedList.head;
        Node previous = null;

        while(node.data != data && node != null) {
            previous = node;
            node = node.next;
        }
        if(node.data == data && node.next != null) {
            previous.next = node.next;
        }
        return linkedList;
    }

    public static SwapLinkedListElement swapElements(SwapLinkedListElement linkedList) {

        Node temp = linkedList.head;

        while(temp != null && temp.next != null) {
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
        }
        return linkedList;
    }

    public static void main(String[] args) {

        SwapLinkedListElement linkedListElement = new SwapLinkedListElement();

        linkedListElement = insert(linkedListElement, 1);
        linkedListElement = insert(linkedListElement, 2);
        linkedListElement = insert(linkedListElement, 3);
        linkedListElement = insert(linkedListElement, 4);
        linkedListElement = insert(linkedListElement, 5);
        linkedListElement = insert(linkedListElement, 6);
        linkedListElement = insert(linkedListElement, 7);

        /*print(linkedListElement);
        SwapLinkedListElement linkedListElement2 = delete(linkedListElement, 3);
        print(delete(linkedListElement2, 2));*/

        print(swapElements(linkedListElement));

    }

}
