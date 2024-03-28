package com.arenapixel.geniusgame.controller;

import com.arenapixel.geniusgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/start")
    public ResponseEntity<String> startGame() {
        gameService.startNewGame();
        return ResponseEntity.ok("Novo jogo iniciado!");
    }

    @PostMapping("/play")
    public ResponseEntity<String> play(@RequestBody List<String> playerSequence) {
        boolean correct = gameService.play(playerSequence);
        if (correct) {
            return ResponseEntity.ok("Acertou! Sua pontuação: " + gameService.getScore());
        } else {
            return ResponseEntity.ok("Errou! Pontuação final: " + gameService.getScore());
        }
    }

    @GetMapping("/score")
    public ResponseEntity<Integer> getScore() {
        return ResponseEntity.ok(gameService.getScore());
    }

    @GetMapping("/gameover")
    public ResponseEntity<Boolean> isGameOver() {
        return ResponseEntity.ok(gameService.isGameOver());
    }
}