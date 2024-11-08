package tr.com.huseyinaydin.models;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java Generics
 *
 */

public class Letter {

    private final String sender;

    public Letter(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}