package step3;
/*
 * 8´Ü°è No.1924 2007³â
 */

import java.util.Scanner;

public class No_8 {
	enum Week {SUN, MON, TUE, WED, THU, FRI, SAT};
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int day = 0;
		
		for(int i = 1; i < a; i++){
			if(i == 2){
				day += 28;
			}else if(i == 4 || i == 6 || i == 9 || i == 11){
				day += 30;
			}else{
				day += 31;
			}
		}
		
		day += b;
		System.out.println(day);
		switch(day%7){
		case 0 : System.out.print("SUN");
			break;
		case 1 : System.out.print("MON");
			break;
		case 2 : System.out.print("TUE");
			break;
		case 3 : System.out.print("WED");
			break;
		case 4 : System.out.print("THU");
			break;
		case 5 : System.out.print("FRI");
			break;
		case 6 : System.out.print("SAT");
			break;
		}
	}
}
