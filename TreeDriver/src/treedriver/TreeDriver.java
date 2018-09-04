/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treedriver;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class TreeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                String st;
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        Scanner stKeyboard = new Scanner(System.in);
        Tree stTree = new Tree();
        TreeNode compareNode;
        while(option != -1)
        {
            System.out.println("1. Enter a new String.\t"+
                                    "2. Search for a String.\t"+
                                    "3.Display Tree.\t"+
                                    "-1. To Exit.");
            option = keyboard.nextInt();
            switch(option)
            {
            case 1:
                System.out.println("Enter the string you would like to add to the tree: ");
                st = stKeyboard.nextLine();
                compareNode = Tree.search(stTree.getRoot(), st);
                if(compareNode != null)
                {
                    compareNode.upFreq();
                    System.out.println("\tRepeated String. Frequency +1.");
                }
                else
                {
                    stTree.insert(st);
                    System.out.println("\tString inserted.");
                }
                st.hashCode();
                
                break;
            case 2: 
                System.out.println("Enter the string you would like to search for: ");
                String searchST = stKeyboard.nextLine();
                compareNode = Tree.search(stTree.getRoot(), searchST);
                if(compareNode != null)
                {
                    System.out.println("FOUND - "+compareNode.getFreq());
                }
                else
                {
                    System.out.println("NOT FOUND.");
                }
                break;
            case 3: 
                    System.out.println("Preordered Strings:");
                    Tree.preorderPrint(stTree.getRoot());
                    System.out.println();
                break;
        }
    }
    }
    
}
