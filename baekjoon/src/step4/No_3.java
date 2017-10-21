package step4;
/*
 * 3단계 No.10871 X보다 작은 수
 */

import java.util.Scanner;

public class No_3 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a >= b && b >= c){
			System.out.print(b);
		}else if(a >= b && b <= c){
			System.out.print(c);
		}else{
			System.out.print(a);
		}
	}
}
