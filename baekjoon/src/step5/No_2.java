package step5;

/*
 * 2단계 No.1065 한수
 */

import java.util.Scanner;

public class No_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[3];
		int han = 0;
		if(N >= 100) {
			han = 99;
			for (int i = 100; i <= N; i++) {
				num[0] = i/100;
				num[1] = (i/10)%10;
				num[2] = i%10;
				int d = num[1] - num[0];
				if (num[1] + d == num[2]) {
					han++;
				}
			}
		}else {
			han = N;
		}
		
        System.out.print(han);
	}
}