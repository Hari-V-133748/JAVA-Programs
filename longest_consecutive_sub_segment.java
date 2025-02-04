/*  Question : 
Given a binary string S consisting of only 0s and 1s, write an algorithm to find the number of different ways to get the longest consecutive sub-segment of 1s only. You are allowed to change any k number of 0s to 1s.
 Note that two ways are similar if they lead to the same string.*/
 import java.util.*;
class longest_consecutive_sub_segment {
    public static int len(String s, int k) {
        int left = 0, max = 0, zeros = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') zeros++;
            if (zeros > k) {
                if (s.charAt(left) == '0') zeros--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        System.out.println(len(s, k));
    }
}
/* OUTPUT : 
Input 1 :
7 1
1010101
Output 1 :
3
Input 2 :
6 2
101010
Output 2 :
5
 */