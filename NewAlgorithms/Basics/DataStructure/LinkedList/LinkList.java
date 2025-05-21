package LinkedList;
public class LinkList {
    Node head;
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(LinkList linkList) {
        Node currentNode = linkList.head;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static LinkList add(LinkList linkList, int data) {
        Node newNode = new Node(data);
        if(linkList.head == null) {
            linkList.head = newNode;
        } else {
            Node last = linkList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Node(data);
        }
        return linkList;
    }

    public static LinkList removeAtNthLocation(LinkList linkList, int n) {
        Node currentNode = null;
        for(int i=1; i<n;i++) {
            if(i==1) {
                currentNode = linkList.head;
                continue;
            }
            if(currentNode != null) {
                currentNode = currentNode.next;
            }
        }
        if(currentNode.next == null) {
            return linkList;
        } else if(currentNode.next.next == null) {
            currentNode.next = null;
        } else {
            currentNode.next = currentNode.next.next;
        }
        return linkList;
    }

    public static LinkList removeLastElement(LinkList linkList) {
        Node currentNode = linkList.head;
        if(currentNode.next == null) {
            linkList.head = null;
            return linkList;
        }
        Node previousNode = linkList.head;
        while (currentNode != null && currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        return linkList;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        LinkList linkList = new LinkList();
        add(linkList, 1);
        printList(linkList);
        removeLastElement(linkList);
        printList(linkList);
        add(linkList, 1);
        add(linkList, 2);
        add(linkList, 3);
        add(linkList, 4);
        add(linkList, 5);
        printList(linkList);
        add(linkList, 6);
        printList(linkList);
        removeAtNthLocation(linkList, 4);
        printList(linkList);
        removeLastElement(linkList);
        printList(linkList);
    }
}