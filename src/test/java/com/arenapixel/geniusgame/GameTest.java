package com.arenapixel.geniusgame;

import com.arenapixel.geniusgame.model.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testAddColorToSequence() {
        game.addColorToSequence();
        assertEquals(2, game.getSequence().size());
    }

    @Test
    void testCheckSequenceCorrect() {
        String firstColor = game.getSequence().get(0);
        assertTrue(game.checkSequence(List.of(firstColor)));
        assertEquals(1, game.getScore());
        assertTrue(game.isActive());
    }

    @Test
    void testCheckSequenceIncorrect() {
        String wrongColor = "wrongColor";
        assertFalse(game.checkSequence(List.of(wrongColor)));
        assertEquals(0, game.getScore());
        assertFalse(game.isActive());
    }
}