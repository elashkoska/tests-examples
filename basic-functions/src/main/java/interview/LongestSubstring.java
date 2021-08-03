package interview;

public class LongestSubstring {

    public static void main(String args[]) {

        String words = "elenaLashenanamajkaanastasijaanaliza";
        System.out.println(words.substring(0, 9));

        String withSpaces="elena lashe pp sk lived since 2012";
        withSpaces=withSpaces.replaceAll("\\s","");

        System.out.println(withSpaces);

    }
}
