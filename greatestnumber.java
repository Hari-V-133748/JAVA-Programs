/*****************
 Question:
 Greatest of three number.
 ****************/


import java.util.*;
public class greatestnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st value : ");
        int a=sc.nextInt();
         System.out.print("Enter 2nd value : ");
        int b=sc.nextInt();
         System.out.print("Enter 3rd value : ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is Great.");
        }
        else if(b>c){
            System.out.println(b+" is Great.");
        }else{
            System.out.println(c+" is Great.");
        }

    }
    
}



/**********************
OUTPUT: 

Enter 1st value : 5
Enter 2nd value : 6
Enter 3rd value : 7
7 is Great.

 *********************/