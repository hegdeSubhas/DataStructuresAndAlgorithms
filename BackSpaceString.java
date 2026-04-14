public class BackSpaceString {
    public static void main(String[] args) {
     String  s = "ab#c";
     String t = "ad#c";
        System.out.println(backSpace(s,t));
    }
    public static boolean backSpace(String s,String t){
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char elm=s.charAt(i);
            if(elm=='#'){
                sb1.deleteCharAt(i-1);
            }else{
                sb1.append(elm);
            }
        }
        for(int i=0;i<t.length();i++) {
            char elm=t.charAt(i);
            if(elm=='#'){
                sb2.deleteCharAt(i-1);
            }else{
                sb2.append(elm);
            }
        }
        if(sb1.compareTo(sb2) == 0){
            return true;
        }else if(sb1.isEmpty()&& sb2.isEmpty()){
            return true;
        }
        return false;
    }
}
