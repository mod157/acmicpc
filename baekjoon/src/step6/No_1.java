package step6;

/*
 * 1단계 No.1152 단어의 개수
 */

import java.util.Scanner;

public class No_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//받은 문자열의 앞, 뒤 공백 제거 (공백을 파악해서 푸는 문제이므로 제거한다)
		String str = scan.nextLine().trim();
		
		//공백만 있는지 확인 (단어 갯수를 파악하는 문제)
		if(str.isEmpty()){
			System.out.print(0);
		}else{
			System.out.print(str.split(" ").length);
		}
	}
}