/************************
 
Question:
To print the Diamond pattern.

 ***********************/
import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in pattern : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int a=n-1;
        for(int i=a;i>0;i--){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}


/******************
 OUTPUT:

 Enter the number of rows in pattern : 5

     *     
    ***    
   *****   
  *******  
 ********* 
  *******  
   *****
    ***
     *
     
 *******************/
