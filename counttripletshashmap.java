package Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class counttripletshashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		int count=0;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				for(int k=j+1;k<n;k++) {
//
//					if((arr[j]/arr[i]) == r && (arr[k]/arr[j]) == r) {
//						count++;
//						continue;
//					}else {
//						continue;
//					}
//				}
//			}
//		}
//		System.out.println(count);
		HashMap<Integer,Integer> map1 = new HashMap<>();
		HashMap<Integer,Integer> map2 = new HashMap<>();
		for(int i=0;i<n;i++) {
			
			if(map2.containsKey(arr[i])) {
				map2.put(arr[i],map2.get(arr[i])+1);
			}else {
				map2.put(arr[i], 1);
			}
			int j = i+1;
			while(j!=n) {
				if((arr[j]/arr[i]) == r) {
					if(map1.containsKey(arr[i])) {
						map1.put(arr[i],map1.get(arr[i])+1);
						map1.put(arr[j],1);
					}else if(map1.containsKey(arr[j])) {
						map1.put(arr[j],map1.get(arr[j])+1);
						map1.put(arr[i],1);
					}else {
						map1.put(arr[i],1);
						map1.put(arr[j],1);
					}
				}
				
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			if(map1.containsKey(arr[i]) && map2.containsKey(arr[i])){
				if(map1.get(arr[i]) != map2.get(arr[i])) {
					map1.put(arr[i],map2.get(arr[i]));
				}
			}
		}
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(int i:map1.keySet()) {
			arr2.add(i);
		}
		int count = 0;
		for(int i=0;i<n-2;i++) {
			int j = i+1;
			int k= j+1;
			
			if(map1.get(arr2.get(i)) != 1 && map1.get(arr2.get(j)) == 1 && map1.get(arr2.get(k)) == 1) {
				//count
			}
//			if((map1.get(arr2.get(j))/map1.get(arr2.get(i))) == (map1.get(arr2.get(k))/map1.get(arr2.get(j)))){
			
			//}
		}
	
	}

}
