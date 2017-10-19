package step2;
/*
 * 8단계 2839번  설탕배달
 */

import java.util.Scanner;

public class No_8 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int three = 0;
		int five = a/5;
		a %= 5;
		while(five >= 0){
			if(a % 3 == 0){
				three = a /3;
				a %= 3;
				break;
			}
			five --;
			a += 5;
		}
		if(a == 0){
			System.out.print(five + three);
		}else{
			System.out.print(-1);
		}
	} 
}
