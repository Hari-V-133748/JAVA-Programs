/*
     JAVA program to convert the given integer to its equal roman. 
*/

import java.util.*;
class int_to_rom{
    public static void main(String[]args){
        int num[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String str="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int a=sc.nextInt();
        for(int i=0;i<num.length;i++){
            while(a>=num[i]){
                str=str+rom[i];
                a=a-num[i];
            }
        }
        System.out.print("Roman: "+str);
    }
}
/* 
     OUTPUT :
     Enter an Integer : 32
     Roman: XXXII
*/