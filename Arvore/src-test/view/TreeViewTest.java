package view;
import view.TreeView;
import model.Tree;



public class TreeViewTest {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(80);
		tree.insertNode(50);
		tree.insertNode(49);
		tree.insertNode(90);
		tree.insertNode(91);
		tree.insertNode(51);
//		tree.insertNode(92);
		tree.insertNode(85);
		tree.insertNode(87);
//		tree.insertNode(95);
//		tree.insertNode(15);
//		tree.insertNode(18);
//		tree.insertNode(17);
//		tree.insertNode(20);
//		tree.insertNode(19);
//		tree.insertNode(35);
//		tree.insertNode(30);
//		tree.insertNode(37);
		
		TreeView representacaoGrafica = new TreeView(tree);
		representacaoGrafica.exibir();
	}
}


