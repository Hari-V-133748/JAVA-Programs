/****************
 
 Question: 
 Find the day of the week.

 ***************/
import java.util.*;
public class days {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number in a Week : ");
        int a=sc.nextInt();
        switch(a){
            case 1:System.out.println("Sunday");
            break;
            case 2:System.out.println("Monday");
            break;
            case 3:System.out.println("Tuesday");
            break;
            case 4:System.out.println("Wednesday");
            break;
            case 5:System.out.println("Thursday");
            break;
            case 6:System.out.println("Friday");
            break;
            case 7:System.out.println("Saturday");
            break;
            default: System.out.println("The given number is in valid.  Enter a valid number.");
        }
    }
    
}

/**********************
OUTPUT:

Enter the number in a Week : 3
Tuesday

**************/
