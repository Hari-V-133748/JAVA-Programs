/***************
 Question:
 
 To find the duplicate value in the array.

 ****************/
import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+" value :");
            arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate value in the given array is : "+arr[i]);
                }
            }
        }
        }
}



/*******************
 
 Enter the length : 3
Enter the 1 value :3
Enter the 2 value :4
Enter the 3 value :3
The duplicate value in the given array is : 3

 *******************/
 
