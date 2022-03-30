package Hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfElements = sc.nextInt();
		int skips = sc.nextInt();
		int[] arr = new int[noOfElements];
		for(int i=0;i<noOfElements;i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
//		for(int i=0;i<skips;i++) {
//			int temp = arr[0];
//			int j=0;
//			while(j<=(arr.length-2)) {
//			arr[j] = arr[j+1];
//			j++;
//			}
//			
//			arr[(arr.length)-1] = temp;
//		}
//		
//	    for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//   
		int mod = skips % n;
		for(int i=0;i<n;i++) {
		System.out.print(arr[(i+mod)%n]+" ");
		}
//		  Collections.rotate(Arrays.asList(arr), n - skips);
		     
		    // Print the rotated array from start position
//		    for(int i = 0; i < n; i++)
//		        System.out.print(arr[i] + " ");
//		}
	}
}
