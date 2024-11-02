package Topic11_BinaryTree;


class Node {
    
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}

class BinarySearchTree{

    Node root;

    public void insert(int data){
        root=insertRec(root, data);
    }

    public Node insertRec(Node root,int data){

        if(root==null){
            root=new Node(data);
        }
        else if(root.data>data){
            root.left=insertRec(root.left,data);
        }
        else if(root.data<data){
            root.right=insertRec(root.right,data);
        }
        return root;

    }


    
    // left -> root --> right 
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }


    // root --> left --> right
    public void PreOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            PreOrderTraversal(node.left);
            PreOrderTraversal(node.right);
        }
    }


    public void PostOrderTraversal(Node node) {
        if (node != null) {
            PostOrderTraversal(node.left);
            PostOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

}


class Main {
    public static void main(String[] args) {

            BinarySearchTree binarySearchTree=new BinarySearchTree();

            binarySearchTree.insert(8);
            binarySearchTree.insert(7);
            binarySearchTree.insert(12);
            binarySearchTree.insert(15);
            binarySearchTree.insert(2);
            binarySearchTree.insert(5);


            //         8
            //      7     12
            //   2            15
            //     5

            binarySearchTree.inOrderTraversal(binarySearchTree.root);
            System.out.println();
            binarySearchTree.PreOrderTraversal(binarySearchTree.root);
            System.out.println();
            binarySearchTree.PostOrderTraversal(binarySearchTree.root);




    

    }

}