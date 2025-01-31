public class LinkedElementsMain {

    public static void main(String[] args) {
        LinkedElements.Node node = new LinkedElements.Node(1);
        LinkedElements.Node node1 = new LinkedElements.Node(2);
        LinkedElements.Node node2 = new LinkedElements.Node(3);
        LinkedElements.Node node3 = new LinkedElements.Node(4);
        LinkedElements.Node node4 = new LinkedElements.Node(5);
        LinkedElements.Node node5 = new LinkedElements.Node(6);
        LinkedElements.Node node6 = new LinkedElements.Node(7);
        LinkedElements.Node node7 = new LinkedElements.Node(8);
        LinkedElements.Node node8 = new LinkedElements.Node(9);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;
        LinkedElements.listElements(node);
        System.out.println("_______________________");
        LinkedElements.Node reverseList = LinkedElements.reverse(node);
        LinkedElements.listElements(reverseList);
        /*LinkedElements.Node afterDelete = LinkedElements.deleteElements(node, 2);
        LinkedElements.listElements(afterDelete);*/
    }

}
