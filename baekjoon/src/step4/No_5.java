package step4;
/*
 * 5단계 No.4344 평균은 넘겠지
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No_5 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < a; i++) {
			double sum = 0;
			int size = scan.nextInt();
			for(int j = 0; j < size; j++) {
				int val = scan.nextInt();
				sum += val;
				array.add(val);
			}
			
			int cnt = 0;
			double avg = sum / size;
			
			for(int k = 0 ; k < size; k++) {
				if(array.get(k) > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f",((double)cnt/size)*100);
			System.out.println("%");
			array.clear();
		}
	}
}
