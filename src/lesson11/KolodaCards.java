package lesson11;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class KolodaCards {
    private ArrayList<Card> cards = new ArrayList<>();

    public KolodaCards() {
    }
    public void initKolodaCards(){
        cards.add(new Card("Пики","2",2) );
        cards.add(new Card("Крести","2",2) );
        cards.add(new Card("Буби","2",2) );
        cards.add(new Card("Черви","2",2) );

        cards.add(new Card("Пики","3",3) );
        cards.add(new Card("Крести","3",3) );
        cards.add(new Card("Буби","3",3) );
        cards.add(new Card("Черви","3",3) );

        cards.add(new Card("Пики","4",4) );
        cards.add(new Card("Крести","4",4) );
        cards.add(new Card("Буби","4",4) );
        cards.add(new Card("Черви","4",4) );

        cards.add(new Card("Пики","5",5) );
        cards.add(new Card("Крести","5",5) );
        cards.add(new Card("Буби","5",5) );
        cards.add(new Card("Черви","5",5) );

        cards.add(new Card("Пики","6",6) );
        cards.add(new Card("Крести","6",6) );
        cards.add(new Card("Буби","6",6) );
        cards.add(new Card("Черви","6",6) );

        cards.add(new Card("Пики","7",7) );
        cards.add(new Card("Крести","7",7) );
        cards.add(new Card("Буби","7",7) );
        cards.add(new Card("Черви","7",7) );

        cards.add(new Card("Пики","8",8) );
        cards.add(new Card("Крести","8",8) );
        cards.add(new Card("Буби","8",8) );
        cards.add(new Card("Черви","8",8) );

        cards.add(new Card("Пики","9",9) );
        cards.add(new Card("Крести","9",9) );
        cards.add(new Card("Буби","9",9) );
        cards.add(new Card("Черви","9",9) );

        cards.add(new Card("Пики","10",10) );
        cards.add(new Card("Крести","10",10) );
        cards.add(new Card("Буби","10",10) );
        cards.add(new Card("Черви","10",10) );

        cards.add(new Card("Пики","Валет",10) );
        cards.add(new Card("Крести","Валет",10) );
        cards.add(new Card("Буби","Валет",10) );
        cards.add(new Card("Черви","Валет",10) );

        cards.add(new Card("Пики","Дама",10) );
        cards.add(new Card("Крести","Дама",10) );
        cards.add(new Card("Буби","Дама",10) );
        cards.add(new Card("Черви","Дама",10) );

        cards.add(new Card("Пики","Король",10) );
        cards.add(new Card("Крести","Король",10) );
        cards.add(new Card("Буби","Король",10) );
        cards.add(new Card("Черви","Король",10) );

        cards.add(new Card("Пики","Туз",11) );
        cards.add(new Card("Крести","Туз",11) );
        cards.add(new Card("Буби","Туз",11) );
        cards.add(new Card("Черви","Туз",11) );
    }
    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51+1);
        return cards.get(randomNum);

    }
}
