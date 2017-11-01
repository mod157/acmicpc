package step5;

/*
 * 3´Ü°è No.2448 º°Âï±â-11
 */

import java.util.Scanner;

public class No_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = 1, blank = 5;
		for (int i = 0; i < N; i++) {
			
			for (int j = 1; j < N - i; j++) {
				System.out.print(" ");
			}
			cnt = i % 3;
			No_3.starPrint(cnt);
			if (i > 2) {
				
				for(int k = 0; k < blank; k++) {
					System.out.print(" ");
				}
				No_3.starPrint(cnt);
				
				if(blank <= 1) {
					blank = (i+1) * 2 +1;
				}
				blank -=2;
			}
			
			System.out.println();
		}
	}

	public static void starPrint(int cnt) {
		switch (cnt) {
		case 0:
			System.out.print("*");
			break;
		case 1:
			System.out.print("* *");
			break;
		case 2:
			System.out.print("*****");
			break;
		}
	}
}