package edu.virginia.sde.hw2.wordle;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GuessResultTest {

    @Test
    void isCorrect_expectTrue(){
        var guess = new GuessResult("false","false");
        assertTrue(guess.isCorrect());
    }

}
