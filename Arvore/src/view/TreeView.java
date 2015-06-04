package view;

import javax.swing.JFrame;

import model.Tree;

public class TreeView {

	private Tree tree;
	private JFrame frame;

	public TreeView(Tree tree) {
		this.tree = tree;
		this.frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800, 600);
	}
	
	public void desenhar() {
		TreeNodeView comp = new TreeNodeView(tree);
		comp.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(comp);
	}

	public void exibir() {
		desenhar();
		frame.setVisible(true);
	}
}
