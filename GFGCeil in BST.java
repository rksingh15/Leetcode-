/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    
    int findCeil(Node root, int key) {
        // code here
       int ceil = -1;
        
        while (root != null) {
            if (root.data == key) {
                return root.data;  // key found, it is the ceil
            } 
            else if (root.data < key) {
                root = root.right;  // move right to find bigger value
            } 
            else {
                ceil = root.data;   // potential ceil
                root = root.left;   // try to find smaller valid ceil
            }
        }
        
        return ceil;
       
       
    }
}
