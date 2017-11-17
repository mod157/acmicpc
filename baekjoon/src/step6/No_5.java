package step6;



/*
 * 5단계 No.10039 평균 점수
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int avg = 0;
		for(int i = 0; i < 5; i++){
			int num = Integer.parseInt(br.readLine());
			avg += (num < 40) ? 40 : num;
		}
		System.out.println(avg / 5);
		br.close();
	}
}