package com.takumicx.pat.advance;


public class Main1135 {

	static class Node {
		int data;
		Node left;
		Node right;
	}

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		int checkNum = Reader.nextInt();

		for (int i = 0; i < checkNum; i++) {
			int nodeNum = Reader.nextInt();
			Node root = null;
			for (int j = 0; j < nodeNum; j++) {
				root = insert(root, Reader.nextInt());
			}

			boolean flag = root.data > 0 && isBlackRedTree(root);
			if(flag){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}

	private static boolean isBlackRedTree(Node root) {

		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		if (root.data < 0) {
			if ((root.left != null && root.left.data < 0)
					|| (root.right != null && root.right.data < 0)) {
				return false;
			}
		}
		int leftBlackNum = getBlackNum(root.left);
		int rightBlackNum = getBlackNum(root.right);
        return leftBlackNum == rightBlackNum;
    }

	private static int getBlackNum(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;
		if (root.data < 0) {
			return Math.max(getBlackNum(root.left), getBlackNum(root.right));
		} else {
			return Math.max(getBlackNum(root.left), getBlackNum(root.right)) + 1;
		}

	}

	private static int getHeight(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	private static Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		if (root == null) {
			Node node = new Node();
			node.data = data;
			return node;
		} else {
			if (Math.abs(data) < Math.abs(root.data)) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
		}
		return root;
	}
}
