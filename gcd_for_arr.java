/*The greatest common divisor (GCD), also called the highest common factor (HCF) of N numbers is the largest positive integer that divides all numbers without giving a remainder. Write an algorithm to determine the GCD of N positive integers.	 */

import java.util.*;
public class gcd_for_arr {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int gcd = arr[0];
        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, arr[i]);
        }
        System.out.println(gcd);
    }
}
/*
Input 1 :
5
2 4 6 8 10
Output 1 :
2
Input 2 :
4
12 36 72 144
Output 2 :
12
 */
