public class LinkedNode {

    Node node;

    static class Node {

        int data;

        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
/*public static LinkedNode insert(LinkedNode head, int data) {
            Node newNode = new Node(data);
            if(head.node == null) {
                head.node = newNode;
            } else {
                Node lastNode = head.node;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
            }
            return head;
        }*/

        public static LinkedNode insert(LinkedNode head, int data) {
            Node newNode = new Node(data);
            if(head.node == null) {
                head.node = newNode;
            } else {
                Node lastNode = head.node;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
            }
            return head;
        }

        public static LinkedNode deleteNode(LinkedNode head, int data) {
            Node previous = null;
            if(head.node != null && head.node.data == data) {
                head.node = head.node.next;
                return head;
            }
            while (head.node != null && head.node.data != data) {
                previous = head.node;
                head.node = head.node.next;
            }
            if(head.node != null) {
                previous.next = head.node.next;
            }
            if (head.node == null) {
                System.out.println("LinkedNode is empty");
            }
            return head;
        }

    }

}
