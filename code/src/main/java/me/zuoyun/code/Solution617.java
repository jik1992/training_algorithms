package me.zuoyun.code;


/**
 * Created by ZuoYun on 2018/5/30.
 * Time: 2:04 PM
 * Information:
 */

public class Solution617 {

  public class TreeNode {

    int      val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public TreeNode find(TreeNode result, TreeNode t1, TreeNode t2) {

    int left = 0, right = 0;
    if (t1 != null) {
      left = t1.val;
    }
    if (t2 != null) {
      right = t2.val;
    }
    result.val = left + right;

    if (t1 != null && t1.left != null || t2 != null && t2.left != null) {
      result.left = new TreeNode(0);
      if (t1 == null) {
        find(result.left, null, t2.left);
      } else if (t2 == null) {
        find(result.left, t1.left, null);
      } else {
        find(result.left, t1.left, t2.left);
      }
    }

    if (t1 != null && t1.right != null || t2 != null && t2.right != null) {
      result.right = new TreeNode(0);
      if (t1 == null) {
        find(result.right, null, t2.right);
      } else if (t2 == null) {
        find(result.right, t1.right, null);
      } else {
        find(result.right, t1.right, t2.right);
      }
    }
    return result;
  }

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return null;
    }
    return find(new TreeNode(0), t1, t2);
  }


}
