package step3;
/*
 * 4단계 No.2438 별찍기
 */

import java.util.Scanner;

public class No_4 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
