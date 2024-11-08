package tr.com.huseyinaydin.models;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class Box<T> {
    
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}