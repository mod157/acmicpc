package step4;
/*
 * 2단계 No.10817 세 수
 */

import java.util.Scanner;

public class No_2 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if( a >= b){
			if(b >= c){
				System.out.print(b);
			}else if(a >= c){
				System.out.print(c);
			}else{
				System.out.print(a);
			}
		}else{
			if(c >= b){
				System.out.print(b);
			}else if(a >= c){
				System.out.print(a);
			}else{
				System.out.print(c);
			}
		}
	}
}
