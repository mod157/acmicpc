package step3;
/*
 * 5�ܰ� No.2439 �����-2
 */

import java.util.Scanner;

public class No_5 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
			for(int k = n; k > i; k--){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
