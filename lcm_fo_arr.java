import java.util.*;
public class lcm_fo_arr{
public static int gcd(int a, int b) 
    { 
    	if (a == 0) 
    		return b; 
    	return gcd(b % a, a); 
    }  
    public static int cal(int a, int b) 
    {
    	return (a*b)/gcd(a, b); 
    }  
    public static int LCM( int arr[],int n){
        int x = cal(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            x = cal(x,arr[i]);
        }
        return x;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(LCM(arr,a));
    }
}

/*
     OUTPUT : 
       input : 5
       10 20 30 40 50
       output : 600
 */