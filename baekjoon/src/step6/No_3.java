package step6;

/*
 * 3´Ü°è No.8958 OXÄûÁî
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();
		int size = Integer.parseInt(str);
		
		for (int k = 0; k < size; k++) {
			str = br.readLine().trim();
			int sum = 0;
			int num = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'O') {
					sum += (++num);
					continue;
				} else {
					num = 0;
					continue;
				}

			}

			System.out.println(sum);
		}
	}
}