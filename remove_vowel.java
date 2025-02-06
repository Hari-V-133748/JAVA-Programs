import java.util.*;
class remove_vowel{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replaceAll("[aAeEIiOouU]","");
        System.out.print(str);
    }
}
/*  OUTPUT : 
Input 1 :
MynameisAnthony
Output 1 :
Mynmsnthny
Input 2 :
IamNeo
Output 2 :
mN
 */