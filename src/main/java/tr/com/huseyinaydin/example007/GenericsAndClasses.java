package tr.com.huseyinaydin.example007;

import tr.com.huseyinaydin.models.Box;
import tr.com.huseyinaydin.models.Letter;
import tr.com.huseyinaydin.models.Phone;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class GenericsAndClasses {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.set(new Phone("Nokia"));
        System.out.println(box.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Mimar Aslan alemin kralı abimiz."));
        System.out.println(box2.get());
    }
}