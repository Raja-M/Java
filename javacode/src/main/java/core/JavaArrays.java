package core;

import java.util.Arrays;
import java.util.List;

public class JavaArrays {

    public static void main(String[] args) {

        System.out.println(" Arrays demo ");

        String[] array = new String[100];

        char[] charArray = new char[10];

        char[] chArrayInit = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        for (char ch : chArrayInit) {
            System.out.println(ch);
        }

        String a[] = new String[]{"a", "b", "c", "d", "e", "f", "g"};

        List<String> listc = Arrays.asList(a);

        System.out.println("String List : " + listc);

        String arrayStr = new String(chArrayInit);

        System.out.println("chaArrayInit : " + chArrayInit.toString());

        System.out.println("arrayStr : " + arrayStr);

        System.out.println("String.valueof : " + String.valueOf(chArrayInit));

        int digits1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int digits2[] = new int[]{9, 9, 9};

        System.out.println(" digits1 : " + Arrays.toString(digits1));
        System.out.println(" digits2 : " + Arrays.toString(digits2));

        int[] result = plusOne(digits1);
        System.out.println(" result 1 : " + Arrays.toString(result));
        int[] result2 = plusOne(digits2);
        System.out.println(" result 2 : " + Arrays.toString(result2));

        String[][] strNames = {
                {"Mr.", "Mrs.", "Ms."},
                {"John", "Jane", "Bob"}};

        IO.println("Names: " + Arrays.deepToString(strNames));
    }


    public static int[]  plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
