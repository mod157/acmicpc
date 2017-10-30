package step5;
/*
 * 2단계 No.1065 한수
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[3];
		int han = 0;
		
		for(int i = 1; i <= N; i++) {
			if(i < 100) {
				han = i;
				continue;
			}else if(i > 1000) {
				break;
			}else{
                int val = i;
                for(int j = 0; j < 2; j++) {
				num[j] = val % 10;
				val /= 10;
                }
                if(num[0] - num[1] == num[1] - num[2]) {
				    han++;
			    }
            }
		}
        System.out.print(han);
	}
}