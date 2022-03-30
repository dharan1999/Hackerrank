package Hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class substringcomparehashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = "";
		String s2 = "";
		sc.nextLine();
		for(int i=0;i<n;i++) {
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			HashMap<Character,Integer> map1 = new HashMap<>();
			for(int j=0;j<a1.length;j++) {
				if(map1.containsKey(a1[j])) {
					int count1 = map1.get(a1[j]);
					count1 += 1;
					map1.put(a1[j], count1);
				}else {
					map1.put(a1[j], 1);
				}
			}
			int count1=0;
			for(char c:a2) {
				if(map1.containsKey(c)) {
					System.out.println("YES");
					break;
				}else {
					count1++;
					//System.out.println("NO");
				}
			}
			if(count1 == a2.length) {
				System.out.println("NO");
			}
		}
		
	}

}
