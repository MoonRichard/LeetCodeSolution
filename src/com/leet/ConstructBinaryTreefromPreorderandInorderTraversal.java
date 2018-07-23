package com.leet;

import com.leet.util.PrintBinaryTree;
import com.leet.util.TreeNode;
import com.leet.util.MyTest;

public class ConstructBinaryTreefromPreorderandInorderTraversal implements MyTest{
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildHelpbyRecursion(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    private TreeNode buildHelpbyRecursion(int[] preorder, int[] inorder,int preBegin,int preEnd, int inBegin,int inEnd){

        if(preBegin>preEnd||inBegin > inEnd){
            return null;
        }
        // get index of divide
        int rootValue = preorder[preBegin];
        TreeNode tn = new TreeNode(rootValue);
        int rootAtInorder = inBegin;
        while(rootValue != inorder[rootAtInorder]){
            rootAtInorder++;
        }
        tn.left = buildHelpbyRecursion(preorder, inorder, preBegin+1, rootAtInorder,inBegin,rootAtInorder-1);
        tn.right = buildHelpbyRecursion(preorder, inorder, rootAtInorder+1, preEnd, rootAtInorder+1,inEnd);
        return tn;
    }






    @Override
    public void test() {
//        int[] preorder = {14,15,17,18,16};
//        int[] inorder = {17,15,18,14,16};
        int[] preorder = {1,2,4,5,3,6,7};
        int[] inorder = {4,2,5,1,6,3,7};
        TreeNode tn = buildTree(preorder,inorder);
//        PrintBinaryTree.print(tn);
    }
}

