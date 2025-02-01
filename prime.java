import java.util.*;
public class prime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        if(isprime(a)){
            System.out.println(a+" is a prime number.");
        }else{
            System.out.println(a+" is not a prime number.");
        }
    }
    public static boolean isprime(int a){
        if(a<2){
            return false;
        }else{
            int count=0;
            for(int i=1;i<a;i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count==1){
                return true;
            }
        }
        return false;
    }
}


/*
      OUTPUT : 

     input : Enter a number : 4
     output : 4 is not a prime number.
 */