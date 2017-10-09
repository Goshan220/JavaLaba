package copy;

import java.util.ArrayList;
import java.util.Collection;

public class App2 {
    public static void main(String[] args) {
        Collection<Object> copies = new ArrayList<>();
        ICopyable monoblock = new Monoblock("lenovo", "black", "21,5", true);
        for (int i = 0; i < 19; i++) {
            copies.add(monoblock.copy());
        }
        for (Object mb:copies) {
            System.out.println(mb);
        }
    }
}
