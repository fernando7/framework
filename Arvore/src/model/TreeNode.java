package model;

public class TreeNode {

	private TreeNode leftNode;
	private TreeNode rightNode;
	private int data;
	private int alturaSae;
	private int alturaSad;
	
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
			
			alturaSae++;
			
		} else {
			if (rightNode == null) {
				rightNode = new TreeNode(insertValue);
			} else {
				rightNode.insert(insertValue);
			} 
			
			alturaSad++;
		}
	}
	
	public int getFatorBalanceamento() {
		return alturaSad - alturaSae;
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
