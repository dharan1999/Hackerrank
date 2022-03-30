package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DavisStaircase {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = stepPerms(n);
      System.out.println(result);
    }
    public static int stepPerms(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        long m = 10000000007l;
        long[] dp = new long[n];
        dp[0] = 1;dp[1] = 2;dp[2] = 4;
        for(int i = 3;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return (int) (dp[dp.length-1] % m);
         
         
     }

}

  



