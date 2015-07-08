package view;

import java.awt.GridLayout;

import javax.swing.JFrame;

import model.TreeNode;

public class TreeNodeViewTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setLayout(new GridLayout(2, 1));
//		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jFrame.setSize(300, 300);
		
		TreeNode treeNode = new TreeNode(600);
		TreeNodeView treeNodeView = new TreeNodeView(treeNode);
		TreeNodeView treeNodeView2 = new TreeNodeView(treeNode);
		
		jFrame.add(treeNodeView);
		jFrame.add(treeNodeView2);
		jFrame.setVisible(true);
	}
}
