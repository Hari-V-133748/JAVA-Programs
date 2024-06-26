/*********************
 Question:

 To check the number as Perfect or not a perfect number.
 #perfect number is the number is equal to sum of its factors value.

********************/
import java.util.*;
public class perfectnumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count=count+i;
            }
        }
        if(n==count){
            System.out.println("The number "+n+" is a Perfect number.");
        }else{
            System.out.println("The number "+n+" is not a Perfect number.");
        }
    }
}

/****************************
 
OUTPUT 1 :

Enter a number : 6
The number 6 is a Perfect number.

OUTPUT 2:

Enter a number : 2
The number 2 is not a Perfect number.

 ***************************/