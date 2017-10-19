package step3;
/*
 * 10단계 No.11720 숫자의 합
 */
import java.util.Scanner;

public class No_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = scan.next();
		
		char[] c = b.toCharArray();
		int sum = 0;
	
		for(int i = 0; i < a; i++){
			sum += Integer.parseInt(c[i]+"");
		}
		System.out.print(sum);
	}
}
