/*You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all 
the odd numbers of the list come after the even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.*/
import java.util.*;
class separate_odd_even{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
/*  OUTPUT : 
 Input 1 :
8
10 98 3 33 12 22 21 11
Output 1 :
10 98 12 22 3 33 21 11
Input 2 :
5
73 4 63 23 65
Output 2 :
4 73 63 23 65
 */