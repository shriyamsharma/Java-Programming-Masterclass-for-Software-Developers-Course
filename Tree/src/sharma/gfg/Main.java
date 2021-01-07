package sharma.gfg;

public class Main {
    Node root;

    public Main() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = six;
        third.right = seven;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(root)

    }
}
