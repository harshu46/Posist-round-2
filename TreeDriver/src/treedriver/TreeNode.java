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
public class TreeNode {
    
        private int freq;   //frequency of the String in the Node
    private String stValue;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(String st)
    {
        stValue = st;
        left = null;
        right = null;
        freq = 1;
    }
    public void add(String st)
    {   
        if (left == null)
        {
            left = new TreeNode(st);
        }
        else if (right == null)
        {
            right = new TreeNode(st);
        }
        else
        {
            if(countNodes(left) <= countNodes(right))
            {
                left.add(st);
            }
            else
            {
                right.add(st);
            }
        }
    }
    //Count the nodes in the binary tree to which root points, and
    public static int countNodes( TreeNode root ) {
        if ( root == null )
            // The tree is empty.  It contains no nodes.
            return 0;  
        else {
            // Start by counting the root.
            int count = 1;   
            // Add the number of nodes in the left subtree.
            count += countNodes(root.getLeft());
            // Add the number of nodes in the right subtree.
                        count += countNodes(root.getRight()); 
                        return count;  // Return the total.
                    }
                }
                public TreeNode getLeft(){
                    return left;
                }
                public TreeNode getRight(){
                    return right;
                }
                public String getString()
                {
                    return stValue;
                }
                public void upFreq()
                {
                    freq = freq + 1;
                }
                public int getFreq()
                {
                    return freq;
                }
    
}
