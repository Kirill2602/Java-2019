package lesson11;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private KolodaCards cards;
    private LinkedList<Player> players = new LinkedList<>();

    public Game() {
        KolodaCards cards = new KolodaCards();
        cards.initKolodaCards();
        this.setCards(cards);
    }

    public void setCards(KolodaCards cards) {
        this.cards = cards;

    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void doFirstRound() {
        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                player.addCardToHand(cards.getRandomCard());
            }

        }
    }

    public void printPlayersHands() {
        for (Player player : players) {
            if (!player.isDialer()) {
                player.printHand();
            }
        }
    }

    public void printAllPlayersHands() {
        for (Player player : players) {
            {
                player.printHand();
            }
        }
    }

    public void doActionPlayers() {
        for (Player player : players) {
            if (!player.isDialer()) {
                while (player.isNeedCard()) {
                    player.takeCard(cards);
                    player.printHand();

                }
            }
        }
    }

    public void doActionDealer() {
        for (Player player : players) {
            if (player.isDialer()) {
                player.takeCard(cards);

            }

        }
    }

    public void printWinner() {
        for (Player player : players) {
            if (player.isDialer()) {
                int values = player.getValueHand();
                if (values > 21) {
                    player.setWinner(false);
                }
            }
        }
        if (getCountWinners() == 1) {
            System.out.println("---------------------");
            System.out.println("-------WINNER-------");
            for (Player player : players) {
                if (player.isWinner()) {
                    player.printHand();
                    return;
                }
            }
        }
        for (int i=21; i>4; i--){
            int summ =0;
            for (Player player:players){
                if(player.getValueHand()==i){
                    System.out.println("---------------------");
                    System.out.println("-------WINNER-------");
                    player.printHand();
                summ++;

                }
            }
            if(summ!=0){
                return;

            }
        }

        }
        private int getCountWinners () {
            int summa = 0;
            for (Player player : players) {
                if (player.isWinner()) {
                    summa++;
                }
            }
            return summa;
        }
    }
