package com.advance.PokerTest.variants;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Poker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FiveCardDrawTest {
    @Mock
    Poker poker;

    @InjectMocks
    private FiveCardDraw fiveCardDraw;

    @BeforeEach
    public void setup(){
        fiveCardDraw = new FiveCardDraw();
    }

    @Test
    void test_getHandSize_shouldReturnFive() {
        int handSize = fiveCardDraw.getHandSize();

        assertEquals(5, handSize);
    }

    @Test
    void test_getHandName_shouldReturn_straightFlush() {

        String handName = fiveCardDraw.getHandName(8000001);

        assertEquals("You have: Straight Flush", handName);
    }

    @Test
    void test_getHandName_shouldReturn_fourOfAKind() {

        String handName = fiveCardDraw.getHandName(7000001);

        assertEquals("You have: Four of a Kind", handName);
    }

    @Test
    void test_getHandName_shouldReturn_fullHouse() {

        String handName = fiveCardDraw.getHandName(6000001);

        assertEquals("You have: Full House", handName);
    }

    @Test
    void test_getHandName_shouldReturn_Flush() {

        String handName = fiveCardDraw.getHandName(5000001);

        assertEquals("You have: Flush", handName);
    }

    @Test
    void test_getHandName_shouldReturn_straight() {

        String handName = fiveCardDraw.getHandName(4000001);

        assertEquals("You have: Straight", handName);
    }

    @Test
    void test_getHandName_shouldReturn_threeOfAKind() {

        String handName = fiveCardDraw.getHandName(3000001);

        assertEquals("You have: Three of a Kind", handName);
    }

    @Test
    void test_getHandName_shouldReturn_twoPairs() {

        String handName = fiveCardDraw.getHandName(2000001);

        assertEquals("You have: Two Pairs", handName);
    }

    @Test
    void test_getHandName_shouldReturn_onePair() {

        String handName = fiveCardDraw.getHandName(1000001);

        assertEquals("You have: One Pair", handName);
    }

    @Test
    void test_getHandName_shouldReturn_highCard() {

        String handName = fiveCardDraw.getHandName(999999);

        assertEquals("You have: High Card", handName);
    }
}