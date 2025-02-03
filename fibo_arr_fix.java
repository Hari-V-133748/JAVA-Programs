/* Fibonacci sereis.*/

import java.util.*;
class fibo_arr_fix{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        arr[0]=1;
        arr[1]=1;
        if(a==1 || a==2 ){
            System.out.print(1);
        }else{
            for(int i=2;i<a;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        System.out.print(arr[a-1]);
    }
}
/*
Input 1 :
8
Output 1 :
21 
*/