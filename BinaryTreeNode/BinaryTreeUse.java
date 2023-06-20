public class BinaryTreeUse {
  
    public static void main(String [] args){
      
       BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
       BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(20);
       root.left = node1;
       BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(30);
       root.right = node2;
    
    }
    
}
