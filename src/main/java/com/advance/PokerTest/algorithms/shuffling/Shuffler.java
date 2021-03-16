package com.advance.PokerTest.algorithms.shuffling;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;

import java.util.List;

public interface Shuffler {
    void shuffleDeck(List<Card> deck);
}
