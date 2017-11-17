package step6;

/*
 * 2단계 No.2577 숫자의 개수
 */

import java.util.Scanner;

public class No_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int num = 1;
		for(int i = 0 ; i < 3; i++){
			num *= scan.nextInt();
		}
		
		//각 하나의 index에 값을 전달받기 위해 char로 변환
		//각 %10 으로 나머지로 처리하는 방법도 존재
		char[] num_str = String.valueOf(num).toCharArray();
		//String num_str = String.valueOf(num)
		//문자를 숫자로 변형해 인덱스로 사용
		for(char ch : num_str){
			arr[Integer.parseUnsignedInt(ch+"")]++;
		}
		
		/*
		 * for(int i = 0; i < num_str.length(); i++ ){
			arr[Integer.parseUnsignedInt(num_str.charAt(i)+"")]++;
		}
		 */
		for(int idx : arr){
			System.out.println(idx);
		}
	}
}