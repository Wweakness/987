//回文数  121 回文数  -121不是
public class Solution1 {
    public static boolean isPalindrome(int x) {
        StringBuffer a=new StringBuffer(x+"");
        String b=a.reverse().toString();
        return (x+"").equals(b);


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1321));
    }
}
