package com.advance.PokerTest.algorithms.shuffling;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class BasicShufflerTest {

    @InjectMocks
    private BasicShuffler shuffler;

    @Test
    public void test_shuffleDeck_shouldShuffle() {
        List<Card> startDeck = generateDeck();
        List<Card> compareDeck = generateDeck();

        shuffler.shuffleDeck(startDeck);

        boolean isShuffled = checkIndividualElements(startDeck, compareDeck);

        assertTrue(isShuffled);
    }

    private List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                deck.add(new Card(i, j));
            }
        }

        return deck;
    }

    private boolean checkIndividualElements(List<Card> startDeck, List<Card> compareDeck) {
        for (int i = 0; i < startDeck.size(); i++) {
            if ((startDeck.get(i).rank() != compareDeck.get(i).rank()) && (startDeck.get(i).suit() != compareDeck.get(i).suit())) {
                return true;
            }
        }

        return false;
    }

}