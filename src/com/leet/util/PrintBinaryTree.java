package com.leet.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTree {
    public static void print(TreeNode tn) {
        System.out.println(Arrays.toString(PrintHelp(tn).toArray()));
    }

    static ArrayList<ArrayList<Integer>> PrintHelp(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrs = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return arrs;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(pRoot);
        int last=q.size(), count=0;
        while(!q.isEmpty()){
            count = 0;
            last = q.size();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            while(count<last){
                TreeNode tr = q.poll();
                count++;
                arr.add(tr.val);
                if(tr.left != null){
                    q.add(tr.left);
                }
                if(tr.right != null){
                    q.add(tr.right);
                }
            }
            arrs.add(arr);
        }
        return arrs;
    }
}
