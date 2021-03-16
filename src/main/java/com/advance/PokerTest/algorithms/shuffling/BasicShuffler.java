package com.advance.PokerTest.algorithms.shuffling;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BasicShuffler implements Shuffler {

    @Override
    public void shuffleDeck(List<Card> deck) {
        System.out.println("Shuffling... Shuffling... Shuffling...");

        // Mathematically speaking, shuffling a deck of 52 cards 7 times yields a random deck
        for (int i = 0; i < 7; i++) {
            Collections.shuffle(deck);
        }
    }
}
