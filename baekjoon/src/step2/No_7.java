package step2;
/*
 * 7�ܰ� 2558��  A+B-2
 */

import java.util.Scanner;
public class No_7 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a+b > 0 && a+b < 10)
			System.out.println(a+b);
		
	}
}
