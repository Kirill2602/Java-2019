package lesson11;

public class Dealer extends Player {
    @Override
    public void takeCard(KolodaCards cards) {
        int valuesCards = this.getValueHand();
        if (valuesCards<18){
            this.addCardToHand(cards.getRandomCard());
            this.takeCard(cards);
        }

    }
}
