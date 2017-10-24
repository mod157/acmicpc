package step4;
/*
 * 6단계 No.1110 더하기 사이클
 */

import java.util.Scanner;

public class No_6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int cnt = 0;
		int val = a;
		do {
			cnt++;
			val = (val % 10) * 10 + (val / 10 + val % 10) % 10;
		}while (a != val);
		System.out.println(cnt);
		
	}
}
