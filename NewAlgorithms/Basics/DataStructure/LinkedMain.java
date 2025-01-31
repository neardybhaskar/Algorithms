public class LinkedMain {

    public static void main(String[] args) {
        LinkedNode node = new LinkedNode();
        LinkedNode.Node.insert(node, 20);
        LinkedNode.Node.insert(node, 30);
        LinkedNode.Node.insert(node, 40);
        LinkedNode.Node.insert(node, 50);
        LinkedNode.Node.insert(node, 60);
        LinkedNode.Node.insert(node, 70);
        LinkedNode.Node.insert(node, 80);
        LinkedNode.Node.insert(node, 90);
        LinkedNode.Node.insert(node, 100);
        System.out.println(node);
        LinkedNode.Node.deleteNode(node, 50);
        System.out.println(node);
    }

}
