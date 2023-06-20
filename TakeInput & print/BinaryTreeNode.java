/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author varun.tandon
 */
public class BinaryTreeNode<T> {
    
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data){
        this.data = data;
    }
    
}
