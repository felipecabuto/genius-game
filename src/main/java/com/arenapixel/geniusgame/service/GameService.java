package com.arenapixel.geniusgame.service;

import com.arenapixel.geniusgame.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private Game game;

    public void startNewGame() {
        game = new Game();
    }

    public boolean play(List<String> playerSequence) {
        return game.checkSequence(playerSequence);
    }

    public int getScore() {
        return game.getScore();
    }

    public boolean isGameOver() {
        return !game.isActive();
    }

    public Game getGame() {
        return game;
    }
}