//You are given a read only array of n integers from 1 to n.
//
//Each integer appears exactly once except A which appears twice and B which is missing.
//
//Return A and B.
//
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Note that in your output A should precede B

//source: interviewBit



import java.net.Inet4Address;
import java.util.*;
public class MissingArray {
    public static void main(String[] args){
        ArrayList <Integer> inputs=new ArrayList<>();
        inputs.add(3);
        inputs.add(1);
        inputs.add(2);
        inputs.add(5);
        inputs.add(3);
        MissingArray ma=new MissingArray();
        System.out.println(ma.repeatedNumber(inputs));
    }
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
         int arr[]=new int[A.size()+1];
         int a=0;
         int b=0;
         ArrayList<Integer> new_list=new ArrayList<>();
         for(int i=0;i<A.size();i++){
             arr[A.get(i)]++;
         }
         for(int i=0;i<arr.length;i++){
             if (arr[i]==2){
                 a=i;
             }
             else if(arr[i]==0){
                 b=i;

             }

         }
         new_list.add(a);
         new_list.add(b);
         return new_list;




    }
}
