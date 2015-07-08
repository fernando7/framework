package view;

import model.Tree;
import model.TreeNode;

public class Teste {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(49);
		tree.insertNode(48);
		tree.insertNode(47);
//		tree.insertNode(46);
//		tree.insertNode(45);
		tree.insertNode(80);
		tree.insertNode(70);
		tree.insertNode(60);
		tree.insertNode(59);
		tree.insertNode(58);
		
//		System.out.println(calcularAltura(tree.getRoot()));
		System.out.println(calcularAlturaEsquerda(tree.getRoot()));

	}
	
	private static int calcularAltura(TreeNode treeNode) {
		int altura = 0;

		if (treeNode != null) {
			int alturaSae = calcularAlturaEsquerda(treeNode);
			int alturaSad = calcularAlturaDireita(treeNode);

			if (alturaSae > altura)
				altura = alturaSae;

			if (alturaSad > altura)
				altura = alturaSad;			
			
			alturaSad = calcularAltura(treeNode.getRightNode());
			alturaSae = calcularAltura(treeNode.getLeftNode());

			if (alturaSad > altura)
				altura = alturaSad;

			if (alturaSae > altura)
				altura = alturaSae;
			
		}
		
		return altura;
	}
	
	private static int calcularAlturaEsquerda(TreeNode treeNode) {
		int altura = 0;
		int alturaSad = 0;
		
		if (treeNode != null && treeNode.getLeftNode() != null) {
			altura++;
			
			altura += calcularAlturaEsquerda(treeNode.getLeftNode());
			alturaSad = calcularAlturaEsquerda(treeNode.getLeftNode().getRightNode());
			
			if (alturaSad > altura)
				altura += alturaSad;
		}
		
		return altura;
	}
	
	private static int calcularAlturaDireita(TreeNode treeNode) {
		int altura = 0;
		if (treeNode != null && treeNode.getRightNode() != null) {
			altura++;
			altura += calcularAlturaEsquerda(treeNode.getRightNode());
		}
		
		return altura;
	}	
}
