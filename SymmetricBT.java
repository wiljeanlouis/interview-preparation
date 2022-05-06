class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class SymmetricBT {
    static boolean isSymmetricUtil(Node root1, Node root2) {
        if (root1 == null || root2 == null)
            return root1 == root2;
        return (root1.data == root2.data) && isSymmetricUtil(root1.left, root2.right) && isSymmetricUtil(root1.right, root2.left);
    }

    static boolean isSymmetric(Node root) {
        if (root == null)
            return true;
        return isSymmetricUtil(root.left, root.right);
    }

/*

                        1
                /                 \
               2                    2   
           /      \             /       \ 
         3         4           4          3
       /   \      /   \      /   \      /   \
      5     6    6     5    5     6    6     5

*/

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        root.left.left.left = new Node(5);
        root.left.left.right = new Node(6);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(5);

        root.right.left.left = new Node(5);
        root.right.left.right = new Node(6);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(5);


        boolean res;
        res = isSymmetric(root);

        if (res)
            System.out.println("The tree is symmetrical");
        else
            System.out.println("The tree is NOT symmetrical");

    }
}