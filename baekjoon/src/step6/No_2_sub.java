package step6;

/*
 * 2�ܰ� No.2577 ������ ����
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2_sub {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//�޸� �ð� ����ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
        int[] arr = new int[10];
		for(int i = 0 ; i < 3; i++){
			num *= Integer.parseInt(br.readLine().trim());
		}
		
		char[] num_str = String.valueOf(num).toCharArray();
	
		for(char ch : num_str){
			arr[Integer.parseUnsignedInt(ch+"")]++;
		}
		
		StringBuilder sb = new StringBuilder();

		for(int idx : arr){
			sb.append(idx + "\n");
		}
		
		System.out.print(sb.toString());
	}
}