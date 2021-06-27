package BinarySearchTree;

public class BST {

	
		class Node {
			int value;
			Node left,right;
			Node(int value){
				this.value=value;
				left=null;
				right=null;
			}
		}
		static Node root;
		public BST() {
			 root=null;
		}
		 
		 public void insert(int key) {
			 root=insert(root,key);
		 }
		
		public Node insert(Node root, int key) {
			if(root == null) {
				root=new Node(key);
				return root;
			}
			else if(root.value>key)
				root.left=insert(root.left,key);
			else if(root.value<key)
				root.right=insert(root.right,key);
			return root;
			
		}
		public static void inorder(Node root) {
			if(root==null)
				return;
			inorder(root.left);
			System.out.print(root.value+" ");
			inorder(root.right);
		}
		
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				BST bt=new BST();
				bt.insert(10);
				bt.insert(12);
				bt.insert(15);
				bt.insert(11);
				inorder(root);
	}

	

}
