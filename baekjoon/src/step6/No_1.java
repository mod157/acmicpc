package step6;

/*
 * 1�ܰ� No.1152 �ܾ��� ����
 */

import java.util.Scanner;

public class No_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//���� ���ڿ��� ��, �� ���� ���� (������ �ľ��ؼ� Ǫ�� �����̹Ƿ� �����Ѵ�)
		String str = scan.nextLine().trim();
		
		//���鸸 �ִ��� Ȯ�� (�ܾ� ������ �ľ��ϴ� ����)
		if(str.isEmpty()){
			System.out.print(0);
		}else{
			System.out.print(str.split(" ").length);
		}
	}
}