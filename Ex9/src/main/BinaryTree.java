package main;

public class BinaryTree {
	
	int valor;
	
	BinaryTree left;
	
	BinaryTree right;
	
	public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
		this.valor = valor;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "Nó {valor: "+this.valor+"}";		
	}
}
