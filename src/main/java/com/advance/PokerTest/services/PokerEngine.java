package com.advance.PokerTest.services;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;
import com.advance.PokerTest.algorithms.shuffling.Shuffler;
import com.advance.PokerTest.models.Hand;
import com.advance.PokerTest.variants.PokerVariant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokerEngine {
    private final List<Card> deck;
    private final Shuffler shuffler;
    private final PokerVariant pokerVariant;

    public PokerEngine(Shuffler shuffler, PokerVariant pokerVariant) {
        this.shuffler = shuffler;
        this.pokerVariant = pokerVariant;
        deck = buildDeck();
    }

    public void start() {

        shuffler.shuffleDeck(deck);

        Hand hand = dealHand(deck);
        String handName = evaluateHand(hand);

        System.out.println(handName);
    }

    private List<Card> buildDeck() {
        List<Card> deck = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                deck.add(new Card(i, j));
            }
        }

        return deck;
    }

    private Hand dealHand(List<Card> deck) {
        Hand hand = new Hand();
        hand.setSize(pokerVariant.getHandSize());
        hand.setHand(deck.subList(0, hand.getSize()));

        return hand;
    }

    private String evaluateHand(Hand hand) {
        int handSize = hand.getSize();
        Card[] arrayHand = hand.getHand().toArray(new Card[handSize]);
        int value = pokerVariant.valueHand(arrayHand);

        displayHand(arrayHand, handSize);

        return pokerVariant.getHandName(value);
    }

    private void displayHand(Card[] hand, int handSize) {
        StringBuilder handString = new StringBuilder("Your hand: ");

        for (int i = 0; i < handSize; i++) {
            handString.append(hand[i].toString()).append(" ");
        }

        System.out.println(handString);
    }
}
