package step2;
/*
 * 5단계 10869번 사칙연산
 */

import java.util.Scanner; 
public class No_5 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.print(a%b);;
	}
}
