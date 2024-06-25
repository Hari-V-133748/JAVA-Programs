/**************
 
  Question:
   Count the number of digit in given number.

 **************/



import java.util.*;
public class add {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the values : ");
        int a =sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Enter the "+(i+1)+" value :");
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a;i++){
            count=count+1;
        }
        System.out.println("The  number of digit in given number :"+count);

    }
    
}




/*********************
 OUTPUT:

Enter the values : 5
Enter the 1 value :3
Enter the 2 value :4
Enter the 3 value :3
Enter the 4 value :2
Enter the 5 value :1
The  number of digit in given number :5

 ********************/
