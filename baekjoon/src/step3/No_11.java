package step3;
/*
 * 11단계 No.11721 열 개씩 끊어 출력하기
 */
import java.util.Scanner;

public class No_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int end =  str.length()/10;
		for(int i = 0; i < str.length()/10; i++){
			System.out.println(str.substring(i*10, (i+1)*10));
		}
		System.out.print(str.substring(end*10, str.length()));
	}
}
