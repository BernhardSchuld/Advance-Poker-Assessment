package com.advance.PokerTest.variants;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;

public interface PokerVariant {
    public abstract int valueHand(Card[] hand);
    public abstract int getHandSize();
    public abstract String getHandName(int value);
}
