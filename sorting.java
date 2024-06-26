/******************************
 Question:
An alternate sort of a list consists of alternate elements (starting from the first position) of the given list after sorting it in ascending order. 
You are given a list of unsorted elements
 **************************/

import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the total numbers : ");
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)+" value : ");
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        for (int i = 0; i < size; i ++) {
            System.out.println("Sorted "+(i+1)+" list : "+list[i]);
        }
        System.out.println("The list after sorting and eliminate the alter number : ");
        for (int i = 0; i < size; i += 2) {
            System.out.print(list[i] + " ");
        }
    }
}
/*************************
 
 OUTPUT: 

Enter the total numbers : 5
Enter the 1 value : 5
Enter the 2 value : 4
Enter the 3 value : 3
Enter the 4 value : 2
Enter the 5 value : 1
Sorted 1 list : 1
Sorted 2 list : 2
Sorted 3 list : 3
Sorted 4 list : 4
Sorted 5 list : 5
The list after sorting and eliminate the alter number :
1 3 5

************************/

