package com.takumicx.niukewang;

import java.util.Scanner;

public class BinarySearchTree {
	
	static class Node {

		int data;

		Node left;

		Node right;

	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext()){
			
			int total = scanner.nextInt();
			
			Node root = null;
			
			for (int i = 0; i < total; i++) {
				int n = scanner.nextInt();
				root = buildTree(root, n);

			}

			preOrder(root);
			
			System.out.println();
			
			inOrder(root);
			
			System.out.println();
			
			postOrder(root);
			
			System.out.println();
		}
		
	}

	private static void postOrder(Node root) {
		
		if (root == null)
			return;

		postOrder(root.left);

		postOrder(root.right);
		
		System.out.print(root.data+" ");
		
	}

	private static void inOrder(Node root) {

		if (root == null)
			return;


		inOrder(root.left);

		System.out.print(root.data+" ");
		
		inOrder(root.right);

	}

	private static void preOrder(Node root) {

		if (root == null)
			return;

		System.out.print(root.data+" ");

		preOrder(root.left);

		preOrder(root.right);

	}

	private static Node buildTree(Node root, int data) {
		if (root == null) {
			Node node = new Node();
			node.data = data;
			return node;
		}
		
		if (data < root.data) {

			root.left= buildTree(root.left, data);

		} else if(data>root.data){

			root.right= buildTree(root.right, data);
		}

		return root;

	}

}
