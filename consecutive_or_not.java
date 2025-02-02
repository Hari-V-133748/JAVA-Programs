import java.util.*;
class Mconsecutive_or_notain{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int out=1;
        Arrays.sort(arr);
        int dif=arr[1]-arr[0];
        for(int i=2;i<a;i++){
            if((arr[i]-arr[i-1])!=dif){
                out=0;
                break;
            }
        }
        if(out==1){
            System.out.print(1);
        }else{
            System.out.print("NO");
        }
    }
}

/*   OUTPUT : 
Input format :
6

3 7 4 5 2 6


Output format :
1

Sample test cases :
Input 1 :
4
1 5 7 8 
Output 1 :
NO
 */