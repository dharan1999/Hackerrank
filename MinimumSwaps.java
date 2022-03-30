package Hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumSwaps {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		List<Integer> arr = new ArrayList<>();
//		List<Integer> arr2 = new ArrayList<>();
		 int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			  arr[i] = sc.nextInt();
//			arr.add(sc.nextInt()); 
//			arr2.add(arr.get(i)); 
		}
		
		int swaps=0;
        for(int i=0;i<arr.length;i++){
            while(i+1 != arr[i]){
                int swapIndex = arr[i] - 1;
                int valAtIndex = arr[i];
                int valAtSwapIndex = arr[swapIndex];
                arr[i] = valAtSwapIndex;
                arr[swapIndex] = valAtIndex;
                swaps++;
            }
        }
        System.out.println(swaps);
//		Collections.sort(arr2);
//		//System.out.println(arr.size());
//		int swaps = 0;
//		int min = Integer.MAX_VALUE;
//		int k = 0;
		
//		int[] arr1 = new int[arr.size()];
//		for(int i=0;i<arr.size();i++) {
//			arr1[i] = arr.get(i);
//		}
//		Arrays.sort(arr1);
//		for(int i : arr1) {
//			arr2.add(i);
//		}
		
//		for(int i=0;i<arr.size();i++) {
//			//System.out.println("i"+ i);
//			for(int j = i;j<arr.size();j++) {
//				//System.out.println("j"+ j);
//			
//				min = Math.min(min, arr.get(j));
//				k = arr.indexOf(min);
//				
//			}
//			min=Integer.MAX_VALUE;
//			//System.out.println("Swap"+ i + " "+ k);
//			if(k!= i) {
//			Collections.swap(arr, k,i);
//			swaps++;
//			}
//			
//			//System.out.println(Arrays.asList(arr));
//			
//			if(arr.equals(arr2)) {
//				break;
//			}
//			
//			
//		}
//		System.out.println(swaps);
		
	}

}
