package edu.virginia.sde.hw2.wordle;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static edu.virginia.sde.hw2.wordle.GameStatus.*;
import static edu.virginia.sde.hw2.wordle.LetterResult.*;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private static Dictionary defaultGuessesDictionary, defaultAnswersDictionary;
    @BeforeAll
    public static void initialize() {
        defaultGuessesDictionary = DefaultDictionaries.getGuessesDictionary();
        defaultAnswersDictionary = DefaultDictionaries.getAnswersDictionary();
    }
    @Test
    public void test_init_zeroArgumentConstructor() {
        var game = new Game();

        assertEquals(defaultGuessesDictionary, game.getGuessDictionary());
        assertTrue(defaultAnswersDictionary.contains(game.getAnswer()));
        assertEquals(6, game.getGuessesRemaining());
        assertEquals(PLAYING, game.getGameStatus());
    }

    @Test
    public void test_init_4ArgumentConstructor() {
        var game = new Game(defaultGuessesDictionary, "TREND", 6, PLAYING);

        assertEquals(defaultGuessesDictionary, game.getGuessDictionary());
        assertEquals("TREND", game.getAnswer());
        assertEquals(6, game.getGuessesRemaining());
        assertEquals(PLAYING, game.getGameStatus());
    }

    @Test
    public void test_isGameOver_WIN_True() {
        var game = new Game(defaultGuessesDictionary, "TREND", 5, WIN);

        assertEquals(WIN, game.getGameStatus());
        assertTrue(game.isGameOver());
    }
//    @Test
//    public void submitGuess_gameLost() {      //TEST SHOULD ALWAYS FAIL
//        var game = new Game(defaultGuessesDictionary, "TREND", 0, LOSS);
//        game.submitGuess("poops");
//    }
//    @Test
//    public void submitGuess_gameWon() {       //TEST SHOULD ALWAYS FAIL
//        var game = new Game(defaultGuessesDictionary, "TREND", 0, WIN);
//        game.submitGuess("TREnd");
//    }
//}
//    @Test
//    public void submitGuess_illegalWord() {   //TEST SHOULD ALWAYS FAIL
//        var game = new Game(defaultGuessesDictionary, "TREND", 2, PLAYING);
//        game.submitGuess("aaaaa");
//    }
    @Test
    public void submitGuess_noGuessesLeftWhilePlaying() {
        var game = new Game(defaultGuessesDictionary, "TREND", 1, PLAYING);
        game.submitGuess("poops");
    }
}