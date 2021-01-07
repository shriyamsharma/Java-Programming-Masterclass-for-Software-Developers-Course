package sharma.gfg;

public class BinaryTree {
    Node root;

    public BinaryTree(Node r) {
        root = r;
    }

    public void inorder(Node root) {
         if (root != null) {
             inorder(root.left);
             System.out.print(root.data + " ");
             inorder(root.right);
         }
    }

    public void preorder(Node root) {
         if (root != null) {
             System.out.print(root.data + " ");
             preorder(root.left);
             preorder(root.right);
         }
    }

    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }


}
