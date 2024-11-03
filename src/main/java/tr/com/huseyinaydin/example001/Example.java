package tr.com.huseyinaydin.example001;

import java.util.ArrayList;
import java.util.List;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot
 *
 */

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        //numbers.add("2");
        for (Object number : numbers) {
            System.out.println((String) number);
        }
    }
}