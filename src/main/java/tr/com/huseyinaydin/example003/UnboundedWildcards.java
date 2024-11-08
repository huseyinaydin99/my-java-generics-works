package tr.com.huseyinaydin.example003;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class UnboundedWildcards {
    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList("11", 2, new Date());
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");
        print(list1);
        print(list2);
        print(list3);
    }

    static void print(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}