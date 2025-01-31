public class LinkedElements {

    Node head;

    static class Node {

        int data;

        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static void listElements(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static Node deleteElements(Node head, int data) {
        if(head == null) {
            return null;
        }
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            if(currNode.data == data) {
                if(prevNode == null) {
                    head = currNode.next;
                    currNode = currNode.next;
                    continue;
                }
                prevNode.next = currNode.next;
                currNode = currNode.next;
                continue;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
        return head;
    }

    public static Node reverse(Node head) {
        if(head == null) {
            return null;
        }
        Node currNode = head;
        Node prev = null;
        Node next = null;
        while(currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

}
