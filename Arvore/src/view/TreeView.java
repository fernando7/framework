package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import model.Tree;

public class TreeView {

	private JFrame frame;
	private JScrollPane scrollPane;

	public TreeView(Tree tree) {
		this.frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(new GridLayout(1, 1));
		frame.setSize(800, 600);
		scrollPane = new JScrollPane(new TreeNodeView(tree));
	}
	
	public void desenhar() {
		frame.getContentPane().add(scrollPane);
	}

	public void exibir() {
		desenhar();
		frame.setVisible(true);
	}
}
