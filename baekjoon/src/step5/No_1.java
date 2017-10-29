package step5;
/*
 * 1단계 No.4673 셀프 넘버
 */
import java.util.HashSet;

public class No_1 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i < 10000; i++) {
			int res = i;
			int num = i;
			if( num >= 10000) { res += num / 10000; num %=10000;}
			if( num >= 1000) { res += num / 1000; num %=1000;}
			if( num >= 100) { res += num / 100; num %=100;}
			if( num >= 10) { res += num / 10; num %=10;}
			set.add(res+num);
			
		}
		
		for(int i = 2; i < 10000; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
