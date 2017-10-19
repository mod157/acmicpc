package step3;
/*
 * 6´Ü°è No.2440 º°Âï±â-3
 */

import java.util.Scanner;

public class No_6 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
			for(int k = n; k >= i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
