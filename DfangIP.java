//1108. Defanging an IP Address
public class DfangIP {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(!Character.isDigit(address.charAt(i))){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String IP = "123.45.34.9";
        System.out.println(DfangIP.defangIPaddr(IP));
    }
}

