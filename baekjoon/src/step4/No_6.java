package step4;
/*
 * 6�ܰ� No.1110 ���ϱ� ����Ŭ
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
