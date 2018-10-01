package main;

import java.util.Scanner;

public class Program {

	static int soma = 0;
	static BinaryTree n1, n2, n3, n4, n5, n6, n7, n8, n9;
	
	public static void calculateBinaryTree(BinaryTree node) {
		System.out.println(node.toString());
		soma += node.valor;
		System.out.println("Var soma: "+ soma);
		if(node.left != null) {
			calculateBinaryTree(node.left);
		}
		if(node.right != null) {
			calculateBinaryTree(node.right);
		}		
	}	

	public static void implementaNos() {
		n1 = new BinaryTree(11, null, null);
		n2 = new BinaryTree(22, null, null);
		n3 = new BinaryTree(33, null, null);
		n4 = new BinaryTree(44, null, null);
		n5 = new BinaryTree(55, n1, null);
		n6 = new BinaryTree(66, n2, null);
		n7 = new BinaryTree(77, n5, n3);
		n8 = new BinaryTree(88, n6, n4);
		n9 = new BinaryTree(99, n8, n7);
	}
	
	public static void main(String[] args) {
		implementaNos();
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha um nó de 1 a 9");
		int escolha = input.nextInt();
		switch(escolha) {
			case 1:{
				calculateBinaryTree(n1);
				break;
			}
			case 2:{
				calculateBinaryTree(n2);
				break;
			}
			case 3:{
				calculateBinaryTree(n3);
				break;
			}
			case 4:{
				calculateBinaryTree(n4);
				break;
			}
			case 5:{
				calculateBinaryTree(n5);
				break;
			}
			case 6:{
				calculateBinaryTree(n6);
				break;
			}
			case 7:{
				calculateBinaryTree(n7);
				break;
			}
			case 8:{
				calculateBinaryTree(n8);
				break;
			}
			case 9:{
				calculateBinaryTree(n9);
				break;
			}
			default:{
				System.out.println("Nó não encontrado");
			}
		}
		
	}
	
}
