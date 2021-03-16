package com.advance.PokerTest.services;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;
import com.advance.PokerTest.algorithms.shuffling.BasicShuffler;
import com.advance.PokerTest.variants.FiveCardDraw;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PokerEngineTest {

    @Mock
    private BasicShuffler shuffler;
    @Mock
    private FiveCardDraw pokerVariant;
    @InjectMocks
    private PokerEngine pokerEngine;

    @Test
    public void test_start_shouldSucceed() {
        
        when(pokerVariant.getHandSize()).thenReturn(5);
        when(pokerVariant.getHandName(anyInt())).thenReturn("You have: Straight Flush");

        pokerEngine.start();

        InOrder inOrder = inOrder(shuffler, pokerVariant);
        inOrder.verify(shuffler).shuffleDeck(anyList());
        inOrder.verify(pokerVariant).getHandSize();
        inOrder.verify(pokerVariant).valueHand(any(Card[].class));
        inOrder.verify(pokerVariant).getHandName(anyInt());

    }
}