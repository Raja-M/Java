package javautil;

import java.util.StringTokenizer;

public class Strings {

    static String in = """
                title=Java: The complete reference; 
                author=Schildt; publisher=McGraw Hill;
                """;
    public static void main( String[] args){
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = "";
            if (st.hasMoreTokens()) {
                val = st.nextToken();
            }
            System.out.println(" Key : " + key + "\t" + " Val : " + val);
        }
    }
}
