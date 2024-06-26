/*************
 
 Question: 
 To find the given number is positive,negative or zero.

 *************/

import java.util.*;
public class pov_neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=sc.nextInt();
        if(a>0){
            System.out.println(a+" is Positive.");
        }else if(a<0){
            System.out.println(a+" is Negative.");
        }else{
            System.out.println(a+ " is Zero.");
        }
    }
    
}


/********************
 OUTPUT:

Enter the number : 0
0 is Zero.

 *******************/