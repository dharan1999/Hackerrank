package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coinchange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int n = sc.nextInt();
		//int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int target = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int j=0;j<arr.length;j++) {
				int index = 0;
				while((arr[index]*arr[index]) <= target) {
					list.add(arr[index]*arr[index]);
					index++;
				}
				break;
			}
			
			
			int[] combinations = new int[target + 1];
			
			combinations[0] = 1;
			
			for(int j : list) {
				for(int k = 1;k<combinations.length;k++) {
					if(k>=j) {
						combinations[k] += combinations[k-j];
						for(int l = 0;l<combinations.length;l++) {
							System.out.print(combinations[l] + " ");
						}
						System.out.println();
					}
				}
			}
			System.out.println(combinations[target]);
			
			
			
		}
		
		
		
		
	}

}
