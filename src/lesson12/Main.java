package lesson12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> texts = new TreeSet<>();
   texts.add(8);
   texts.add(8);
        texts.add(3);
        texts.add(4);
        texts.add(5);
        System.out.println(texts);
    }
}
