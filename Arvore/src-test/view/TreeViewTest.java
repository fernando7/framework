package view;
import view.TreeView;
import model.Tree;



public class TreeViewTest {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(80);
		tree.insertNode(79);
		tree.insertNode(78);
		tree.insertNode(77);
		tree.insertNode(76);
		tree.insertNode(75);
		tree.insertNode(74);
		tree.insertNode(73);
		
		TreeView representacaoGrafica = new TreeView(tree);
		representacaoGrafica.exibir();
	}
}


