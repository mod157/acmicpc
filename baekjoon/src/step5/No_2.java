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
		
		for(int i = 1; i <= N; i++) {
			int val = i;
			
			if(i < 100) {
				han = i;
				continue;
			}
			if(i > 1000) {
				break;
			}
			
			for(int j = 0; j < 2; j++) {
				num[j] = val % 10;
				val /= 10;
			}
			
			if(num[0] - num[1] == num[1] - num[2]) {
				if(num[0] - num[1] == 0 || num[1] - num[2] == 0)
				{
					continue;
				}
				han++;
			}
		}
		System.out.print(han);
	}
}
