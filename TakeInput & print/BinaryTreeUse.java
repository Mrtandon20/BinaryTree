/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Scanner;

/**
 *
 * @author varun.tandon
 */
public class BinaryTreeUse {
    
    public static void print(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        String ans = root.data +  " : ";
            if(root.left!= null){
                ans = ans + "L:" + root.left.data;
        }
            
            if(root.right!= null){
                ans = ans + "R:" + root.right.data;
        }
            
         System.out.println(ans);
            
         print(root.left);
         print(root.right);
         
        
    } 
    
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data : ");
        int rootdata = sc.nextInt();
        if(rootdata == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
      
            root.left = takeInput();
            root.right = takeInput();
            
        return root;
    }
    
    public static void main(String [] args){
        
        
    
        BinaryTreeNode<Integer> root = takeInput();
        print(root);
        
        
//        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(20);
//        root.left = node1;
//        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(30);
//        root.right = node2;
    
    }
    
}
