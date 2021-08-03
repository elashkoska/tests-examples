package interview;

public class ReverseNumber {

    public static void main(String args[]) {


        int i = 123;
        String reverseNumber = Integer.toString(i);
        StringBuffer sbf = new StringBuffer(reverseNumber);
        System.out.println(sbf.reverse());
    }

}
