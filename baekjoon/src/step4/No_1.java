package step4;
/*
 * 1단계 No.9498 시험 성적
 */

import java.util.Scanner;

public class No_1 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int val = a/10;
		if(val == 10 || val == 9){
			System.out.print("A");
		}else if(val == 8){
			System.out.print("B");
		}else if(val == 7){
			System.out.print("C");
		}else if(val == 6){
			System.out.print("D");
		}else
			System.out.print("F");
	}
}
