import java.util.*;
public class PermutationString {
    public static void permute(String s,int i,int n) {
        if (i == n) {
            System.out.println(s);

        } else {
            for (int j = i; j <= n; j++) {

                s=swap(s, i, j);
                permute(s, i + 1, n);
                s=swap(s, i, j);

            }
        }
    }
    public static String swap(String s, int i,int j){
        char str[]=s.toCharArray();
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
        return String.valueOf(str);
    }
    public static void main(String[] args){
        String a="ABCD";
        permute(a,0,a.length()-1);
    }
}
