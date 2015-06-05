package view;
import view.TreeView;
import model.Tree;



public class TreeViewTest2 {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(100);
		
		//Sub arvore a direita da raiz
//		tree.insertNode(300);
//		tree.insertNode(180);
//		tree.insertNode(150);
//		tree.insertNode(149);
//		tree.insertNode(190);
//		tree.insertNode(189);
//		tree.insertNode(200);
		
		
		//Sub arvore a esquerda da raiz
		tree.insertNode(50);
		tree.insertNode(70);
		tree.insertNode(69);
		tree.insertNode(30);
		tree.insertNode(29);
		tree.insertNode(28);
		tree.insertNode(27);
		tree.insertNode(26);

		TreeNodeView2 treeNodeView2 = new TreeNodeView2(tree);
	}
}

