package step6;

/*
 * 2�ܰ� No.2577 ������ ����
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
		
		//�� �ϳ��� index�� ���� ���޹ޱ� ���� char�� ��ȯ
		//�� %10 ���� �������� ó���ϴ� ����� ����
		char[] num_str = String.valueOf(num).toCharArray();
		//String num_str = String.valueOf(num)
		//���ڸ� ���ڷ� ������ �ε����� ���
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