package step6;

/*
 * 4단계 No.2920 음계
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().trim().split(" ");

		// 미리 체크 후에 실행
		int checker = Integer.parseInt(s[0]);
		if(checker != 1 && checker != 8){
			System.out.print("mixed");
			return;
		}
		
		int dif = Integer.parseInt(s[1])  - checker;
	
		for(int i = 2; i < 8; i++){
			int new_dif = Integer.parseInt(s[i]) - Integer.parseInt(s[i-1]);
			if(new_dif == dif){
				continue;
			}else{
				System.out.print("mixed");
				return;
			}
		}
		if(dif > 0){
			System.out.print("ascending");
		}else{
			System.out.print("descending");
		}
	}
}