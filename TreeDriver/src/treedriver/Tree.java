/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treedriver;

/**
 *
 * @author student
 */
public class Tree {
        private TreeNode root;
    public Tree()
    {
        root = null;
    }
    public boolean isEmpty()
    {
        return root == null;
    }
    public void insert(String st)
    {
        if (isEmpty())
        {
            root = new TreeNode(st);
        }
        else
        {
            root.add(st);
        }
    }
    public TreeNode getRoot()
    {
        return root;
    }
    public static TreeNode search(TreeNode root, String st)
    {
        if(root == null) 
        {
            return null;
        }
        else if(st.equals(root.getString()))
        {
            return root;
        }
        else 
        {   if (root.getLeft() != null)
                return search(root.getLeft(), st);
            else
                return search(root.getRight(), st); 
        }
    }
    
    public TreeNode found(TreeNode root)
    {
        return root;
    }
    public static void preorderPrint(TreeNode root) 
    {
    if ( root != null )
        {  
          System.out.print( root.getString() + " " );  // Print the root item.
          preorderPrint( root.getLeft() );   // Print items in left subtree.
          preorderPrint( root.getRight() );  // Print items in right subtree.
    }
    }
    
}
