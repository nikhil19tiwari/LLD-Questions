package in.nikhil.project.recursion;
/*
 * look this pattern when you have to find wheter this solution exist you can do in this way also 
 */
class CheckSolitionExist {
    public boolean checkInclusion(String s1, String s2) {
        return rec(0,s1.toCharArray(),s2);
    }
    public boolean rec(int level,char[]ch,String s2){
        //level
        if(level == ch.length){
            if(s2.contains(new String(ch))){
                return true;
            }
            return false;
        }
        //choice
        for(int i=level;i<ch.length;i++){
            char temp = ch[i];
            ch[i] = ch[level];
            ch[level] = temp;
            if(rec(level+1,ch,s2)){
                return true;
            }
            char temp1 = ch[i];
            ch[i] = ch[level];
            ch[level] = temp1;
        }
        return false;
    }
}