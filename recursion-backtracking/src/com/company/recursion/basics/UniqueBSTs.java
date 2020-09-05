package com.company.recursion.basics;

import java.util.ArrayList;
import java.util.List;

public class UniqueBSTs {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
    }

    public List<TreeNode> generateTrees(int n) {
        return generateTreeList(1,n);
    }

    public List<TreeNode> generateTreeList(int start, int end){
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start>end)
        {
            list.add(null);
            return list;
        }

        if(start == end){
            list.add(new TreeNode(start));
            return list;
        }

        List<TreeNode> left, right;

        for(int i=start;i<=end;i++){

            left = generateTreeList(start,i-1);
            right = generateTreeList(i+1,end);

            for(TreeNode lnode: left)
            {
                for(TreeNode rnode: right)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }

        }

        return list;
    }


}
