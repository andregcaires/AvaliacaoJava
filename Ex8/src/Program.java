import java.util.Scanner;

/*
 * Autor: André Guaraldo Caires
 * */

public class Program {

	static final int MAX = 1000000;
	static Scanner input;
	static String number;
	static char[] arrayA, arrayB;
	
	public static int buildArray(char[] arrayC) {
		int positionA = 0;
		int positionB = 0;
		boolean BFull = false;
		boolean AFull = false;
		for(int i = 0; i < arrayC.length; i++) {
			if((i % 2 == 0 && !AFull) || BFull) {
				arrayC[i] = arrayA[positionA];
				positionA++;
				if(positionA > arrayA.length -1) {
					AFull = true;
				}
			}
			else if((!(i % 2 == 0) && !BFull) || AFull){
				arrayC[i] = arrayB[positionB];
				positionB++;
				if(positionB > arrayB.length -1) {
					BFull = true;
				}
			}
			if(i == 0) {
				System.out.print("Terceiro número: ");
			}			
			System.out.print(arrayC[i]);
		}
		int result = Integer.parseInt(new String(arrayC));
		if(result > MAX) {
			return -1;
		}
		return 0;
	}
	
	public static int main(String[] args) {
		
		input = new Scanner(System.in);
		

		
		System.out.println("Insira o primeiro número: ");
		number = Integer.toString(input.nextInt());
		arrayA = number.toCharArray();
		System.out.println("Insira o segundo número: ");
		number = Integer.toString(input.nextInt());
		arrayB = number.toCharArray();
		
		char[] arrayC = new char[arrayA.length + arrayB.length];

		return buildArray(arrayC);

	}

}
