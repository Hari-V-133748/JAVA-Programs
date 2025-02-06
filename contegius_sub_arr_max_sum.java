import java.util.*;
public class contegius_sub_arr_max_sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int out=maxi(arr);
        System.out.print(out);
    }
    public static int maxi(int[]arr){
        int a=arr[0];
        int b=arr[0];
        for(int i=1;i<arr.length;i++){
            b=Math.max(arr[i],b+arr[i]);
            a=Math.max(b,a);
        }
        return a;
    }
}
/* OUTPUT :
5
1 2 3 -2 5
9

4
-1 -2 -3 -4
-1
 */