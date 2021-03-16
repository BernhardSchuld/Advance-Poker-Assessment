package com.advance.PokerTest.variants;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;
import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Poker;
import org.springframework.stereotype.Component;

@Component
public class FiveCardDraw implements PokerVariant {

    @Override
    public int valueHand(Card[] hand) {
        return Poker.valueHand(hand);
    }

    @Override
    public int getHandSize() {
        return 5;
    }

    @Override
    public String getHandName(int value) {
        if (value > Poker.STRAIGHT_FLUSH) {
            return "You have: Straight Flush";
        } else if (value > Poker.FOUR_OF_A_KIND) {
            return "You have: Four of a Kind";
        } else if (value > Poker.FULL_HOUSE) {
            return "You have: Full House";
        } else if (value > Poker.FLUSH) {
            return "You have: Flush";
        } else if (value > Poker.STRAIGHT) {
            return "You have: Straight";
        } else if (value > Poker.SET) {
            return "You have: Three of a Kind";
        } else if (value > Poker.TWO_PAIRS) {
            return "You have: Two Pairs";
        } else if (value > Poker.ONE_PAIR) {
            return "You have: One Pair";
        } else {
            return "You have: High Card";
        }
    }
}
