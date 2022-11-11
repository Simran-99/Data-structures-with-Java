import java.util.*;
public class Permutation {
    public static void findpermutations(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        findpermutations(s,i+1,ans+s.charAt(i));
        findpermutations(s,i+1,ans);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= String.valueOf(n);

        findpermutations(s,0,"");
    }
}
