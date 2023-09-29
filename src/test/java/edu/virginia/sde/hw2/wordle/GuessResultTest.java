package edu.virginia.sde.hw2.wordle;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GuessResultTest {

//    @Test
//    void isCorrect_expectTrue(){
//        var guess = new GuessResult("false","false");
//        assertTrue(guess.isCorrect());
//    }

//    @Test
//    void getLetterResults_allWrong(){
//        var guess = new GuessResult("false","zzzzz");
//
//        var expectedResult = new LetterResult[] {LetterResult.GRAY, LetterResult.GRAY,
//                LetterResult.GRAY, LetterResult.GRAY, LetterResult.GRAY};
//           assertEquals(expectedResult,guess.getLetterResults());
//
//    }
    @Test
    void getLetterResults_allRight(){
        var guess = new GuessResult("false","false");
        var expectedResult = new LetterResult[] {LetterResult.GREEN, LetterResult.GREEN,
        LetterResult.GREEN, LetterResult.GREEN, LetterResult.GREEN};
        assertEquals(expectedResult,guess.getLetterResults());
    }




}
