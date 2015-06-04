package model;


public class Tree {

	private TreeNode root;
	
	public Tree() {
		root = null;
	}
	
	public void insertNode(int insertValue) {
		if (root == null) {
			root = new TreeNode(insertValue);
		} else {
			root.insert(insertValue);
		}
	}
	
	public void preorderTraversal(){
		preorderHelper(root);
	}	
	
	private void preorderHelper(TreeNode node) {
		if (node == null) {
			return;
		}
		
		System.out.printf("%d ", node.getData());
		preorderHelper(node.getLeftNode());
		preorderHelper(node.getRightNode());
	}
	
	public void inorderTraversal() {
		inorderHelper(root);
	}
	
	private void inorderHelper(TreeNode node) { 
		if (node == null) {
			return;
		}
		
		inorderHelper(node.getLeftNode());
		inorderHelper(node.getRightNode());
		System.out.printf("%d ", node.getData());
	}
	
	public void postorderTraversal() {
		postorderHelper(root);
	}
	
	private void postorderHelper(TreeNode node){
		if(node == null){
			return;
		}
		postorderHelper(node.getLeftNode());
		postorderHelper(node.getRightNode());
		System.out.printf("%d ", node.getData());
	}
	
	public TreeNode getRoot() {
		return root;
	}
}
