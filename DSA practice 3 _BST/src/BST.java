public class BST {

    Node root;

    public void CreateTree(int data){

        Node newNode = new Node(data);

        if(root==null){
            root = newNode ;
            return;
        }
        Node temp = root;

        while (true){
            if(data<temp.data){

                if(temp.left==null){

                    temp.left = newNode;
                    return;
                }
                temp = temp.left;
            }
            else {
                if(temp.right == null){

                    temp.right = newNode;
                    return;
                }
                temp = temp.right;
            }

        }
    }

    public void PrintInorder(){

        InOrder(root);
    }
    public void PrintPostOrder(){

        PostOrder(root);
    }
    public void PrintPreOrder(){

        PreOrder(root);
    }


    public void InOrder(Node current){

        if(current == null){

            return;
        }
        InOrder(current.left);
        System.out.print(" "+current.data);
        InOrder(current.right);
    }

    public void PostOrder(Node current){
        if(current == null){

            return;
        }
        InOrder(current.left);
        InOrder(current.right);
        System.out.print(" "+ current.data);
    }


    public void PreOrder(Node current){
        if(current == null){

            return;
        }
        System.out.print(" "+current.data);
        PostOrder(current.left);
        InOrder(current.right);

    }

}
