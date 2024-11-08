package tr.com.huseyinaydin.example005;

import java.util.Arrays;
import java.util.List;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        printNumbers(list2);
        printNumbers(list3);
    }

    static void printNumbers(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}