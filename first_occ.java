/*
Given an array of n integers. The task is to find the first element that occurs k number of times. If no element occurs k times the print -1.   
*/

import java.util.*;
public class first_occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(occ(arr, k));
    }
    public static int occ(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == k) return num;
        }
        return -1;
    }
}

/*
       Output 1 :
      input:  
      5 
      1 2 3 2 4
      2
      output:
      2

      Output 2 :
     input:
     5
     1 2 3 4 5
     2
     output:
     -1
 */