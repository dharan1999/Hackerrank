package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Newyearchaos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int max = Integer.MIN_VALUE;
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] q = new int[n];
			int[] p = new int[n];
			for(int j=0;j<q.length;j++) {
				q[j] = sc.nextInt();
				p[j] = q[j];
			}
			
			int p1 = 1;
			int p2 = 2;
			int p3 = 3;
			int bribes = 0;
			int check = 0;
			for(int j=0;j<q.length;j++) {
				if(q[j] == p1) {
					p1 = p2;
					p2 = p3;
					++p3;
				}else if(q[j] == p2) {
					++bribes;
					p2 = p3;
					++p3;
				}else if(q[j] == p3) {
					bribes += 2;
					++p3;
				}else {
					check++;
					System.out.println("Too Chaotic");
					break;
				}
			}
			if(check == 0)
			{ System.out.println(bribes); }
//			Arrays.sort(p);
//			
//			int diff = 0;
//			int[] arr = new int[n];
//			int count = 0;
//			int ll=0;
//			int check1=0;
//			int check2=0;
//			for(int j=0;j<q.length;j++) {
//				for(int k=0;k<p.length;k++) {
//					if(q[j] != p[k]) {
//						continue;
//					}else {
//							diff = k - j;
//							
//							if(diff> 0 && diff<3) {
//								ll += diff;
//								int c=k;
//								while(diff != 0) {
//									int temp = p[c];
//									p[c] = p[c-1];
//									p[c-1] = temp;
//									c--;
//									diff--;
//		
//								}
//								
//								break;
//								
//							}else if(diff>=3){
//								check1++;
//								break;
//							}else {
//								check2++;
//								break;
//							}
//							
//						 
//					}
//				}
//				
//			}
//			
//			if(check1!=0) {
//				System.out.println("Too choatic");
//			}else if(check2 == p.length) {
//				System.out.println(0);
//			}else {
//				System.out.println(ll);
//			}

		}
		
		
	}

}
