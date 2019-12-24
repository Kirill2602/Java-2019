package lesson11;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Player {
    private LinkedList<Card> hand = new LinkedList<>();
    private boolean isDialer = false;
    private boolean isNeedCard = true;
    private boolean isWinner = true;

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public LinkedList<Card> getHand() {
        return hand;
    }

    public void setHand(LinkedList<Card> hand) {
        this.hand = hand;
    }

    public boolean isDialer() {
        return isDialer;
    }

    public void setDialer(boolean dialer) {
        isDialer = dialer;
    }

    public boolean isNeedCard() {
        return isNeedCard;
    }

    public void setNeedCard(boolean needCard) {
        isNeedCard = needCard;
    }

    public void printHand(){
        System.out.println("------Это крупье? - " +isDialer);
        System.out.println("-------- Карты: --------");
        for(Card card:hand){

     System.out.println(card);
        }
        System.out.println("-----------------------------");
        }
        public void takeCard(KolodaCards cards){
            System.out.println("Берете ли вы карту?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("Да")) {
this.addCardToHand(cards.getRandomCard());
            }else if (answer.equals("Нет")){
this.setNeedCard(false);
            }else {
                System.out.println("------------Повторите ввод!!!");
                this.takeCard(cards);
            }
        }
        public int getValueHand(){
        int summa = 0;
        for (Card card:hand){
            summa = summa+card.getValue();
        }
        return summa;
        }
    }
