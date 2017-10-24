package step4;
/*
 * 4´Ü°è No.1546 Æò±Õ
 */

import java.util.Scanner;

public class No_4 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] vals = new int[a];
		int max = 0;
		double sum = 0;
		for(int i = 0; i < a; i++) {
			vals[i] = scan.nextInt();
			if(vals[i] > max) {
				max = vals[i];
			}
		}
		for(int i = 0; i < a; i++) {
			double val = (vals[i]/(double)max) * 100;
			sum += val;
		}
		System.out.printf("%.2f", sum/a );
	}
}
