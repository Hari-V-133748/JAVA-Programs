/* Question :
You are given two strings containing only English alphabets. Write an algorithm to count the number of occurrences of the 
second string in the first string neglecting the case of the letters.
*/
import java.util.*;
class occurance_of_string_in_another_string{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String st=sc.nextLine().toLowerCase();
        str=str.replaceAll(st,"*");
        int co=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='*'){
                co++;
            }
        }
        System.out.print(co);
    }
}
/* OUTPUT : 
Input 1 :
TimisplayinginthehouseofTimwiththetoysofTim
Tim
Output 1 :
3
Input 2 :
TimisplayingwiththetoysofTim
Tim
Output 2 :
2
 */
