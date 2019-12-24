package lesson12;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer>holodilnik = new HashMap<>();
        holodilnik.put("Яблоко", 5);
        holodilnik.put("Груша", 2);
        holodilnik.put("Слива", 3);
        holodilnik.put("Ананас", 7);
        System.out.println(holodilnik);
        int summa=0;
        for (String currentProduct:holodilnik.keySet()){
            summa = summa+holodilnik.get(currentProduct);
        }
        System.out.println(summa);

        holodilnik.put("Груша",3+holodilnik.get("Груша"));
        System.out.println(holodilnik);
    }
}
