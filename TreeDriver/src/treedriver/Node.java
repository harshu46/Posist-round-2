/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treedriver;

import java.util.List;

/**
 *
 * @author student
 */
public class Node {
  
    int value;
    List<Node> children;

    @Override
    public int hashCode(){
         int childCount = children.size();
         int sum = 0;
         for (Node stKeyboard : children)
             sum += stKeyboard.hashCode();
         int hashCode = childCount * 2^31 + value * 2^23 + sum * 2^13;

         return hashCode;
    }
}
    

