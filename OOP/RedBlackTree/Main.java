package OOP.RedBlackTree;

class BinaryTree{
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Color color;
    }

    private enum Color{
        RED,BLACK
    }
    
    boolean push(int value){
        if(root == null){
            root = new Node();
            root.value = value;
            root.color = Color.BLACK;
            return true;
        }else {
            Node node = root;
            while (node != null) {
                if (node.value == value) {
                    return false;
                }
                if (node.value < value) {
                    if (node.right == null) {
                        node.right = new Node();
                        node.right.value = value;
                        node.right.color = Color.RED;
                        node.right = rebalance(node.right);
                        //rebalance()
                        return true;
                    } else {
                        node = node.right;
                    }
                } else {
                    if (node.left == null) {
                        node.left = new Node();
                        node.left.value = value;
                        node.left.color = Color.RED;
                        node.left = rebalance(node.left);
                        return true;
                    } else {
                        node = node.left;
                    }
                }
            }
            return false;
        }
    }

    private void colorChange(Node node){
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
        node.color = Color.RED;
    }

    private Node leftTurn(Node node){
        Node left = node.left;
        Node change = left.right;
        left.right = node;
        node.left = change;
        left.color = node.color;
        node.color = Color.RED;
        return left;
    }

     private Node rightTurn(Node node){
        Node right = node.right;
        Node change = right.left;
        right.left = node;
        node.right = change;
        right.color = node.color;
        node.color = Color.RED;
        return right;
    }

    private Node rebalance(Node node){
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.right != null && result.right.color == Color.RED &&
                (result.left == null || result.left.color == Color.BLACK)) {
                needRebalance = true;
                result = rightTurn(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                result.left.left != null && result.left.left.color == Color.RED){
                needRebalance = true;
                result = leftTurn(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                result.right != null && result.right.color == Color.RED){
                needRebalance = true;
                colorChange(result);
            }
        }
        while (needRebalance);
        return result;
    }

    boolean find(int value){
        Node node = root;
        while(node != null){
            if(node.value == value){
                return true;
            }
            if(node.value < value){
                node = node.right;
            }else{
                node = node.left;
            }
        }
        return false;
    }

    

}
public class Main {
    public static void main(String[] args) {
//        HashMap map = new HashMap();
//        map.push(1, 2);
//        map.push(3, 4);
//        map.push(5, 6);
//
//        System.out.println(map.find(3));
//        System.out.println(map.find(2));
//
//        map.push(17, 8);
//
//        System.out.println(map.find(17));

        BinaryTree tree = new BinaryTree();

        tree.push(5);
        tree.push(3);
        tree.push(7);
        tree.push(2);
        tree.push(4);
        tree.push(6);
        tree.push(8);

        System.out.println(tree.find(8));
        System.out.println(tree.find(10));

    }
}
