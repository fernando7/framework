package view;

import model.Tree;
import model.TreeNode;

public class FatorBalancementoTest {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(42);
		tree.insertNode(15);
		tree.insertNode(6);
		tree.insertNode(27);
		tree.insertNode(20);
		tree.insertNode(88);
		tree.insertNode(63);
		tree.insertNode(57);
		tree.insertNode(94);
		tree.insertNode(71);
		
		TreeNode root = tree.getRoot();
		TreeNode leftNode = root.getLeftNode();
		TreeNode rightNode = root.getRightNode();
		
		while (leftNode != null) {
			System.out.println(leftNode.getData() + ": " + leftNode.getFatorBalanceamento());
			leftNode = leftNode.getLeftNode();
		}
		
		System.out.println("--------------------------------------------");
		
		while (rightNode != null) {
			System.out.println(rightNode.getData() + ": " + rightNode.getFatorBalanceamento());
			rightNode = rightNode.getLeftNode();
		}
	}
}
