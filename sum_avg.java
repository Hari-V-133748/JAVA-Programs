/************************
 * 
  Question:
  To find the total and average of given numbers.

 ***********************/
import java.util.*;
public class sum_avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i=0;i<a;i++){
            System.out.print("Enter the "+(i+1)+" value : ");
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
            count = count + arr[i];
        }
        int avg=(count/a);
        System.out.println("The total sum of given "+a+" number is : "+count);
        System.out.println("The average of given "+a+" number is : "+avg);
    }
    
}


/************************
 
 OUTPUT:
Enter the total number : 5
Enter the 1 value : 2
Enter the 2 value : 4
Enter the 3 value : 6
Enter the 4 value : 8
Enter the 5 value : 10
The total sum of given 5 number is : 30
The average of given 5 number is : 6

 ************************/
