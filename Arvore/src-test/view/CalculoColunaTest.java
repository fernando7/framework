package view;

import static org.junit.Assert.*;
import model.Tree;

import org.junit.Test;

public class CalculoColunaTest {

	@Test
	public void test() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-1, calculoColunas.getColunasSAE());
	}
	
	@Test
	public void test2() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(49);
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-2, calculoColunas.getColunasSAE());
	}	

	@Test
	public void test3() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(49);
		tree.insertNode(48);
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-3, calculoColunas.getColunasSAE());
	}
	
	@Test
	public void test4() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(49);
		tree.insertNode(48);
		tree.insertNode(51);
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-3, calculoColunas.getColunasSAE());
	}		
	
	@Test
	public void test5() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(49);
		tree.insertNode(48);
		tree.insertNode(70);
		tree.insertNode(69);
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-3, calculoColunas.getColunasSAE());
	}
	
	@Test
	public void test6() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(70);
		tree.insertNode(69);
		tree.insertNode(68);
		
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-2, calculoColunas.getColunasSAE());
	}
	
	@Test
	public void test7() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(70);
		tree.insertNode(69);
		tree.insertNode(68);
		tree.insertNode(67);
		
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-3, calculoColunas.getColunasSAE());
	}
	
	@Test
	public void test8() {
		Tree tree = new Tree();
		tree.insertNode(100);
		tree.insertNode(50);
		tree.insertNode(70);
		tree.insertNode(81);
		tree.insertNode(69);
		tree.insertNode(65);
		tree.insertNode(80);
		tree.insertNode(79);
		tree.insertNode(78);
		tree.insertNode(77);
		
		
		CalculoColunas calculoColunas = new CalculoColunas(tree);
		calculoColunas.calcularColunasEsquerda(tree.getRoot(), false);
		assertEquals(-3, calculoColunas.getColunasSAE());
	}			
	
}
