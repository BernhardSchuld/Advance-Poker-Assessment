package com.advance.PokerTest.models;

import com.advance.PokerTest.algorithms.poker.mathcs.emery.edu.Card;
import lombok.Data;

import java.util.List;

@Data
public class Hand {
    int size;
    List<Card> hand;
}
