package view;

import model.Tree;
import model.TreeNode;

public class CalculoColunas {

	private Tree tree;

	public CalculoColunas(Tree tree) {
		this.tree = tree;
	}

	public int calcularColunasEsquerdaDaRaiz() {
		TreeNode sae = tree.getRoot().getLeftNode();
		
		int totalNodesEsquerda = calcularColunasEsquerda(sae, 0);
		return totalNodesEsquerda > 0 || sae != null ? totalNodesEsquerda + 1 : 0;
	}	
	
	private int calcularColunasEsquerda(TreeNode treeNode) {
		return calcularColunasEsquerda(treeNode, 0);
	}
	
	private int calcularColunasEsquerda(TreeNode treeNode, int quantidadeDireita) {
		int totalEsquerda = 0;
		if (treeNode != null) {
		
			if (treeNode.getLeftNode() != null) {
				totalEsquerda++;
				totalEsquerda += calcularColunasEsquerda(treeNode.getLeftNode());
			}
			
			int totalEsquerdaApartirDaDireita = calcularColunasEsquerda(treeNode.getRightNode(), quantidadeDireita + 1);
			System.out.println("Quantidade direita: " + quantidadeDireita);
			System.out.println("Total a partir da esquerda: " + totalEsquerdaApartirDaDireita);
			totalEsquerda += totalEsquerdaApartirDaDireita - quantidadeDireita;
		}

		return totalEsquerda;
	}	
}
