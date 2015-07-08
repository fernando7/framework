package view;

import model.Tree;

public class TreeViewTest {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(130);
		tree.insertNode(150);
		
		TreeView treeView = new TreeView(tree);
		treeView.exibir();
	}
}
