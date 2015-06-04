package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import model.Tree;
import model.TreeNode;

public class TreeNodeView extends Canvas {

	private static final long serialVersionUID = -5464885177018499935L;
	private Tree tree;
	private int decremetroX;
	
	public TreeNodeView(Tree tree) {
		this.tree = tree;
	}
	
	@Override
	public void paint(Graphics g) {
		TreeNode root = tree.getRoot();
		g.setColor(Color.RED);
		g.drawOval(350, 20, 40, 40);
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(root.getData()), 360, 45);	
		
		desenharTreeNodeEsquerda(g, root.getLeftNode(), 350, 40);
		
		decremetroX = 0;
		desenharTreeNodeDireita(g, root.getRightNode(), 350, 40);		
	}
	
	private void desenharTreeNodeEsquerda(Graphics g, TreeNode leftTreeNode, int ultimoX, int ultimoY) {
		if (leftTreeNode != null) {
			g.drawLine(ultimoX, ultimoY + 10, ultimoX - 120 + decremetroX, ultimoY + 40);
			g.setColor(Color.RED);
			g.drawOval(ultimoX - 150 + decremetroX, ultimoY + 38, 40, 40);
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(leftTreeNode.getData()), ultimoX - 138 + decremetroX, ultimoY + 62);
			
			decremetroX = 35;
			desenharTreeNodeDireita(g, leftTreeNode.getRightNode(), ultimoX - 152, ultimoY + 60);
			desenharTreeNodeEsquerda(g, leftTreeNode.getLeftNode(), ultimoX - 148, ultimoY + 60);
		}
	}
	
	private void desenharTreeNodeDireita(Graphics g, TreeNode rightTreeNode, int ultimoX, int ultimoY) {
		if (rightTreeNode != null) {
			g.drawLine(ultimoX + 40, ultimoY + 10, ultimoX + 160 - decremetroX, ultimoY + 40);
			g.setColor(Color.RED);
			g.drawOval(ultimoX + 150 - decremetroX, ultimoY + 38, 40, 40);
			g.setColor(Color.BLACK);
			g.drawString(Integer.toString(rightTreeNode.getData()), ultimoX + 163 - decremetroX, ultimoY + 62);
			
			decremetroX = 35;
			desenharTreeNodeEsquerda(g, rightTreeNode.getLeftNode(), ultimoX + 155, ultimoY + 60);
			desenharTreeNodeDireita(g, rightTreeNode.getRightNode(), ultimoX + 150, ultimoY + 60);
		}
	}	
}
