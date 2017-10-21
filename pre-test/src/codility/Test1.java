package codility;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] agrs) {
		// write your code in Java SE 8
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int solution = 0;
		String str = Integer.toBinaryString(N);
		String[] strs = str.split("1");
		for (String s : strs) {
			if (s.trim().equals("1")) {
				continue;
			}
			if(s.length() > solution){
				solution = s.length();
			}
		}
		System.out.println(solution);
	}
}
