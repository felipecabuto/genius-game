package com.arenapixel.geniusgame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<String> sequence;
    private int score;
    private boolean active;

    private static final String[] COLORS = {"vermelho", "verde", "azul", "amarelo"};

    public Game() {
        this.sequence = new ArrayList<>();
        this.score = 0;
        this.active = true;
        addColorToSequence();
    }

    public void addColorToSequence() {
        Random random = new Random();
        int index = random.nextInt(COLORS.length);
        sequence.add(COLORS[index]);
    }

    public boolean checkSequence(List<String> playerSequence) {
        if (!active) {
            throw new IllegalStateException("O jogo não está ativo");
        }

        if (playerSequence.equals(sequence)) {
            score++;
            addColorToSequence();
            return true;
        } else {
            active = false;
            return false;
        }
    }

    public List<String> getSequence() {
        return sequence;
    }

    public int getScore() {
        return score;
    }

    public boolean isActive() {
        return active;
    }
}