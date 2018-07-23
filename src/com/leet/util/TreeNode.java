 package com.leet.util;

 public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode(int x) { val = x; }

     @Override
     public String toString() {
         while (this != null){
             return val+"\n"+left.toString()+"\n"+right.toString();
         }
         return "";

     }
 }