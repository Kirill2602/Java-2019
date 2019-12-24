package lesson12;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2, 1980, 5);
        Coin coin2 = new Coin(3, 1999, 9);
        Coin coin3 = new Coin(4, 1970, 7);
        Coin coin4 = new Coin(5, 1990, 1);
        Coin coin5 = new Coin(2, 1980, 5);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for (Coin coin:coins){
            System.out.println(coin);

        }
    }
}
