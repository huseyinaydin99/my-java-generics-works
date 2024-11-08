package tr.com.huseyinaydin.example006;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class GenericAndMethods {
    public static void main(String[] args) {
        String ali = "Hüseyin";
        String[] names = {ali, "Ceyda"};
        Character[] letters = {'A', 'B', 'C'};
        Integer[] numbers = {1, 2, 4, 5, 5};

        print(names);
        print(letters);
        print(numbers);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}