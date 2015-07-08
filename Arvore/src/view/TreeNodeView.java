package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import model.TreeNode;

public class TreeNodeView extends Canvas {

	private static final long serialVersionUID = -2489893661793022846L;
	private TreeNode treeNode;

	public TreeNodeView(TreeNode treeNode) {
		this.treeNode = treeNode;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(0, 0, 45, 45);
		g.setColor(Color.BLACK);
		String dataStr = Integer.toString(treeNode.getData());
		g.drawString(dataStr, calcularXInicial(dataStr), 25);
	}

	private int calcularXInicial(String dataStr) {
		return 19 - dataStr.length() * 2;
	}

	public void setPosition(int x, int y) {
		setBounds(x, y, 48, 48);
	}
}
