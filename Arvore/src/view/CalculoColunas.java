package view;

import model.Tree;
import model.TreeNode;

public class CalculoColunas {

	private Tree tree;
	private int colunasSAE;
	private int colunasDireitaSAE;
	
	public CalculoColunas(Tree tree) {
		this.tree = tree;
	}
	
	public void calcularColunasEsquerda(TreeNode treeNode, boolean treeNodeRight) {
		
		if (treeNode != null && treeNode.getLeftNode() != null) {
			TreeNode atual = treeNode.getLeftNode();
			
			if (!treeNodeRight || colunasDireitaSAE - 1 < colunasSAE) 
				colunasSAE--;
			
			if (atual.getRightNode() != null) {
				colunasDireitaSAE++;
				calcularColunasEsquerda(atual.getRightNode(), true);
			}
			
			calcularColunasEsquerda(atual, false);
		}
	}
	
	public int getColunasSAE() {
		return colunasSAE;
	}
}
