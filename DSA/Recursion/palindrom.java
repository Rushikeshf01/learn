public class palindrom {
    static boolean checkPalindrom(int i,String str,int n){
        if(i>=n/2){
            return true;
        }
        if(str.charAt(i) == str.charAt(n-i-1)){
            return checkPalindrom(i+1,str,n);
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "MADAM";
        System.out.println(checkPalindrom(0, name, name.length()));
    }
}
