package studio3;


import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("How big do you want your array? ");
		int arraySize = in.nextInt();


		boolean[] numbers = new boolean[arraySize];

		for(int i = 2; i < arraySize; i++) {
			for(int j = i; j < arraySize; j++) {


				if(j%i != 0) {
					numbers[j]= true;
				} 
			}

		} for( int k = 0; k < arraySize; k++) {
			if(numbers[k] == true) {
				System.out.println(k+1);
			}

			in.close();

		}
	}
}
