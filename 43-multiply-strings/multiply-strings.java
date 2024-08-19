import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger c=a.multiply(b);
         res.append(c);
        return res.toString();
    }
}