package model;

public class TreeNode {

	private TreeNode leftNode;
	private TreeNode rightNode;
	private int data;
	
	public TreeNode(int nodeData)  {
		data = nodeData;
		leftNode = rightNode = null;
	}
	
	public void insert(int insertValue) {
		if (insertValue < data) {
			if (leftNode == null) {
				leftNode = new TreeNode(insertValue);
			} else {
				leftNode.insert(insertValue);
			} 
		} else {
			if (rightNode == null) {
				rightNode = new TreeNode(insertValue);
			} else {
				rightNode.insert(insertValue);
			} 
		}
	}
	
	public TreeNode getLeftNode() {
		return leftNode;
	}
	
	public TreeNode getRightNode() {
		return rightNode;
	}
	
	public int getData() {
		return data;
	}
}
