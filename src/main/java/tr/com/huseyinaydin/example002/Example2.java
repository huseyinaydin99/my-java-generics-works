package tr.com.huseyinaydin.example002;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class Example2 {
    public static void main(String[] args) {
        //Comparable number = 10;
        //number.compareTo("10");
        Comparable<Integer> number = 10;
        System.out.println(number.compareTo(9));
    }
}