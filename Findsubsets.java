import java.util.*;
//Find subsets

public class Findsubsets {
    public static void findsubsets(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //Yes choice
        findsubsets(str,i+1,ans+str.charAt(i));
        //No choice
        findsubsets(str,i+1,ans);


    }
    public static void main(String[] args){
        findsubsets("abc",0,"");

    }
}
