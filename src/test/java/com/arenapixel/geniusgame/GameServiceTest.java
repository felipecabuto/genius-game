package com.arenapixel.geniusgame;

import com.arenapixel.geniusgame.service.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {
    private GameService gameService;

    @BeforeEach
    void setUp() {
        gameService = new GameService();
    }

    @Test
    void testStartNewGameAndPlay() {
        gameService.startNewGame();
        assertFalse(gameService.isGameOver());

        List<String> correctSequence = List.of(gameService.getGame().getSequence().get(0));
        assertTrue(gameService.play(correctSequence));
        assertFalse(gameService.isGameOver());

        List<String> incorrectSequence = List.of("corIncorreta");
        assertFalse(gameService.play(incorrectSequence));
        assertTrue(gameService.isGameOver());
    }

    @Test
    void testGetScore() {
        gameService.startNewGame();
        assertEquals(0, gameService.getScore());

        List<String> correctSequence = List.of(gameService.getGame().getSequence().get(0));
        gameService.play(correctSequence);
        assertEquals(1, gameService.getScore());
    }
}