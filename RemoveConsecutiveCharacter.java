//Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.




class RemoveConsecutiveCharacter{
    public static void main(String[] args) {
        String s=removeConsecutiveCharacter("aaabbaabaaacc");
        System.out.println(s);
        
    }
    public static String removeConsecutiveCharacter(String S){
        String new_str="";
        if(S.length()==1){
            return S;
        }
        
        else{
            new_str=new_str+S.charAt(0);
            int j=0;
            for(int i=j+1;i<S.length();i++){
                
                 if(S.charAt(j)==S.charAt(i)){
                    continue;
                }
                else{
                    j=i;
                    new_str=new_str+S.charAt(j);
                }
                
            }
        }
        
        
        return new_str;
        
    }
}
