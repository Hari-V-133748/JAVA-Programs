/*************
Question:

To find minimum in given values.

*************/

import java.util.*;
public class minimum {
    public static void main(String[] args) {
         // initialization the input in array
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        // assign the first value as minimum
        int min=arr[0];
        //checking the minimum
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        // print the minimum value 
        System.out.println("Minimum in array is : "+min);

    }
    
}



/************
OUTPUT:
Enter the array length : 3
3
4
2
Minimum in array is : 2

*************/

