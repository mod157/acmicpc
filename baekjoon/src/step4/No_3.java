package step4;
/*
 * 3�ܰ� No.10871 X���� ���� ��
 */

import java.util.Scanner;

public class No_3 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int i = 0; i < a; i++) {
			int val = scan.nextInt();
			if(b > val ){
				System.out.print(val+" ");
			}
		}
	}
}
