package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import model.Tree;
import model.TreeNode;

public class TreeView {

	private JFrame frame;
	private JScrollPane scrollPane;
	private Tree tree;

	public TreeView(Tree tree) {
		this.tree = tree;
		this.frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800, 600);
		desenhar();
	}
	
	public void desenhar() {
		TreeNode atual = tree.getRoot();
		TreeNodeView treeNodeAnterior = null;
		
		int x = 10;
		int y = 10;
		
		while (atual != null) {
			TreeNodeView treeNodeView = new TreeNodeView(atual);
			treeNodeView.setPosition(x, y);
			frame.getContentPane().add(treeNodeView);
			atual = atual.getRightNode();
			x += 50;
			y += 50;
		}
	}

	public void exibir() {
		frame.setVisible(true);
	}
}
