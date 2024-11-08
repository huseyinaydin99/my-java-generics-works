package tr.com.huseyinaydin.example004;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class GenericType {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("1");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        Map<String, String> map = new HashMap<>();

        Map<Point, Double> map2 = new HashMap<>();
        /*
            İsimlendirme Kuralları
            E – Element (Java Collection Framework tarafından yaygın kullanılır)
            K – Key (Map'lerde kullanıldı anahtar değer eşlem)
            N – Number
            T – Type
            V – Value (Map'lerde kullanıldı anahtar değer eşlem)
         */
    }
}