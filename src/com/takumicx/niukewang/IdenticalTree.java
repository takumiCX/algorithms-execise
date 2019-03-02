package com.takumicx.niukewang;

public class IdenticalTree {

	static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public boolean chkIdentical(TreeNode A, TreeNode B) {
		
		if(A==null&&B==null) return true;
		
		if((A==null&&B!=null)||(B==null&&A!=null)) return false;
		
		if(A.val!=B.val) return false;
		
		return chkIdentical(A.left, B.left)&&chkIdentical(A.right, B.right);
		
		// write code here
	}
}
