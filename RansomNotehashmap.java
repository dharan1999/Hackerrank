package Hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNotehashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		
		String[] s1 = new String[n];
		String[] s2 = new String[n1];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			s1[i] = sc.next();
		}
		
		for(int i=0;i<n1;i++) {
			s2[i] = sc.next();
		}
		
		HashMap<String,Integer> map1 = new HashMap<>();
		//HashMap<String,Integer> map2 = new HashMap<>();
		
		for(int i=0;i<s1.length;i++) {
			if(map1.containsKey(s1[i])) {
				int count1 = map1.get(s1[i]);
				count1 += 1;
				map1.put(s1[i], count1);
			}else {
				map1.put(s1[i], 1);
			}
		}
		int check = 0,check1 = 0;
		for(String s : s2) {
			if(map1.containsKey(s)) {
				//System.out.println("YES");
				check += 1;
				int count = map1.get(s);
				count -= 1;
				map1.put(s,count);
				if(map1.get(s) == 0) {
					map1.remove(s);
				}
				//break;
			}else {
				check1++;
			}
		}
		//System.out.println(map1);
		if(check1 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
