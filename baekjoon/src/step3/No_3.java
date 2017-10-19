package step3;
/*
 * 3단계 No.2739  구구단
 */

import java.util.Scanner;

public class No_3 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i < 10; i++){
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
