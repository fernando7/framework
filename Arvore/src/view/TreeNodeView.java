package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import model.Tree;
import model.TreeNode;

public class TreeNodeView extends Canvas {

	private static final long serialVersionUID = -5464885177018499935L;
	private Tree tree;
	private int larguraEsquerda;
	private int larguraDireita;
	
	public TreeNodeView(Tree tree) {
		this.tree = tree;
		calcularLarguraEsquerda(tree.getRoot());
		calcularLarguraDireita(tree.getRoot());
		setSize(larguraDireita + larguraEsquerda + 300, 800);
	}
	
	private void calcularLarguraEsquerda(TreeNode treeNode) {
		if (treeNode.getLeftNode() != null) {
			larguraEsquerda += 120;
			calcularLarguraEsquerda(treeNode.getLeftNode());
		}
		
		larguraEsquerda += 120;
	}
	
	private void calcularLarguraDireita(TreeNode treeNode) {
		if (treeNode.getRightNode() != null) {
			larguraDireita += 120;
			calcularLarguraDireita(treeNode.getRightNode());
		}
		
		larguraDireita += 120;
	}	
	
	
	@Override
	public void paint(Graphics g) {
		TreeNode root = tree.getRoot();
		desenharCirculo(g, larguraEsquerda, 20);
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(root.getData()), larguraEsquerda + 10, 45);	
		
		desenharTreeNodeEsquerda(g, root.getLeftNode(), larguraEsquerda, 40, larguraEsquerda / 2);
		desenharTreeNodeDireita(g, root.getRightNode(), larguraEsquerda, 40, larguraEsquerda / 2);		
	}

	private void desenharTreeNodeEsquerda(Graphics g, TreeNode leftTreeNode, int ultimoX, int ultimoY, int tamanhoAresta) {
		if (leftTreeNode != null) {
			int xFinalAresta = ultimoX - 8 - tamanhoAresta;
			int xInicioCirculo = xFinalAresta - 20;
			int xFinalValor = ultimoX - 136 + tamanhoAresta;

			desenharAresta(g, ultimoX + 20, ultimoY + 20, xFinalAresta, ultimoY + 40);
			desenharCirculo(g, xInicioCirculo, ultimoY + 40);
//			desenharValor(g, leftTreeNode.getData(), xFinalValor, ultimoY + 65);
			
			int novoTamanhoAresta = (tamanhoAresta - 30) / 2;
			desenharTreeNodeEsquerda(g, leftTreeNode.getLeftNode(), xInicioCirculo, ultimoY + 60, novoTamanhoAresta);
			desenharTreeNodeDireita(g, leftTreeNode.getRightNode(), xInicioCirculo, ultimoY + 60, novoTamanhoAresta);
		}
	}
	
	private void desenharTreeNodeDireita(Graphics g, TreeNode rightTreeNode, int ultimoX, int ultimoY, int tamanhoAresta) {
		if (rightTreeNode != null) {
			final int xFinalAresta = ultimoX + 45 + tamanhoAresta;
			final int xInicioCirculo = xFinalAresta - 20;
			int xFinalValor = ultimoX + 162 - tamanhoAresta;

			desenharAresta(g, ultimoX + 20, ultimoY + 20, xFinalAresta, ultimoY + 40);
			desenharCirculo(g, xInicioCirculo, ultimoY + 40);
//			desenharValor(g, rightTreeNode.getData(), xFinalValor, ultimoY + 65);
			
			int novoTamanhoAresta = (tamanhoAresta + 30) / 2;
			desenharTreeNodeEsquerda(g, rightTreeNode.getLeftNode(), xInicioCirculo, ultimoY + 60, novoTamanhoAresta);
			desenharTreeNodeDireita(g, rightTreeNode.getRightNode(), xInicioCirculo, ultimoY + 60, novoTamanhoAresta);
		}
	}
	
	private void desenharValor(Graphics g, int data, int x, int y) {
		g.setColor(Color.BLACK);
		g.drawString(Integer.toString(data), x, y);
	}

	private void desenharAresta(Graphics g, int xInicial, int yInicial, int xFinal, int yFinal) {
		g.setColor(Color.BLACK);
		g.drawLine(xInicial, yInicial, xFinal, yFinal);
	}
	
	private void desenharCirculo(Graphics g, int x, int y) {
		g.setColor(Color.RED);
		g.drawOval(x, y, 40, 40);		
	}	
}
