/*You are playing an online game. In the game, a numbers is displayed on the screen. In order to win the game, you have to Count the trailing zeros in the factorial value of the given number. Write an algorithm to count the trailing zeros in the factorial value of the given number.

Input format :
The input consists of an integer num, representing the number displayed on the screen.

Output format :
Print An integer representing the count of trailing zeros in the factorial of the given numbers*/
import java.util.*;
class MCount_trailing_zerosain{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int co=0;
        while(a>=5){
            a/=5;
            co+=a;
        }
        System.out.print(co);
    }
}

/* 
Input 1 :
5
Output 1 :
1
*/