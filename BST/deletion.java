package BinarySearchTree;

import BinarySearchTree.BST.Node;

public class deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		BST bt=new BST();
		root=bt.insert(root,10);
		root=bt.insert(root,20);
		root=bt.insert(root,35);
		root=bt.insert(root,5);
		root=bt.insert(root,7);
		root=bt.insert(root,3);
		root=bt.insert(root,15);
		root=delete(root,20);
		//BST.inorder(root);
		levelorder(root);

	}

	private static void levelorder(Node root) {
		// TODO Auto-generated method stub
		int h=height(root);
		for(int i=1;i<=h;i++) {
			levelorder(root,i);
		}
		
	}

	private static int height(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		int lh=height(root.left);
		int rh=height(root.right);
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
	}

	private static void levelorder(Node root, int level) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(level==1)
			System.out.print(root.value+" ");
		else if(level>1) {
			levelorder(root.left,level-1);
			levelorder(root.right,level-1);
		}
					
		
	}

	private static Node delete(Node root, int key) {
		// TODO Auto-generated method stub
		if(root==null)
			return root;
		if(root.value>key)
			root.left=delete(root.left,key);
		else if(root.value<key)
			root.right=delete(root.right,key);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.value=min(root.right);
			root.right=delete(root.right,root.value);
		}
		return root;
	}

	private static int min(Node root) {
		// TODO Auto-generated method stub
		int minv=root.value;
		while(root.left!=null) {
		
			minv=root.value;
			root=root.left;
		}
		return minv;
	}

}
