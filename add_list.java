/**************
  Question:

  Add the values in list.
  
**************/
import java.util.*;
public class add_list {
    public static void main(String[] args) {
        LinkedList <Integer> num = new LinkedList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        int sum=0;
        for(int i=0;i<num.size();i++){
            sum=sum+num.get(i);
        }
        System.out.println("The sum of given list value is : "+sum);

    }
    
}


/**************
  OUTPUT:
  The sum of given list value is : 60
 
 **************/