package view;
import view.TreeView;
import model.Tree;



public class TreeViewTest {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(100);
		
		//Sub arvore a direita da raiz
		tree.insertNode(300);
		tree.insertNode(180);
		tree.insertNode(150);
		tree.insertNode(149);
		tree.insertNode(190);
		tree.insertNode(189);
//		tree.insertNode(130);
		tree.insertNode(200);
		
		
		//Sub arvore a esquerda da raiz
		tree.insertNode(50);
		tree.insertNode(60);
		tree.insertNode(61);
		tree.insertNode(59);
		tree.insertNode(20);
		tree.insertNode(21);
		
		TreeView representacaoGrafica = new TreeView(tree);
		representacaoGrafica.exibir();
	}
}

