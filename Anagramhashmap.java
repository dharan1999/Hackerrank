package Hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagramhashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//sc.nextLine();
		String s="";
		for(int i=0;i<n;i++) {
			s = sc.next();
			System.out.println(anagram(s));
		}
		
	}

	private static int anagram(String s) {
		
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				char[] arr = s.substring(i,j+1).toCharArray();
				Arrays.sort(arr);
				//System.out.println(arr);
				String k = new String(arr);
				//System.out.println(k);
				if(map.containsKey(k)) {
					map.put(k, map.get(k)+1);
				}else {
					map.put(k, 1);
				}
			}
		}
		int anagrams = 0;
		for(String s1:map.keySet()) {
			int v = map.get(s1);
			anagrams += v*(v-1)/2;
		}
		return anagrams;
	}

}
