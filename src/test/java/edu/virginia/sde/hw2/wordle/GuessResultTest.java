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
//
//    @Test
//    void getLetterResults_allRight(){
//        var guess = new GuessResult("false","false");
//        var expectedResult = new LetterResult[] {LetterResult.GREEN, LetterResult.GREEN,
//        LetterResult.GREEN, LetterResult.GREEN, LetterResult.GREEN};
//        for (int i = 0; i <5; i++) {
//            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
//        }
//    }
//        @Test
//    void getLetterResults_allWrong(){
//        var guess = new GuessResult("false","zzzzz");
//        var expectedResult = new LetterResult[] {LetterResult.GRAY, LetterResult.GRAY,
//        LetterResult.GRAY, LetterResult.GRAY, LetterResult.GRAY};
//        for (int i = 0; i <5; i++) {
//            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
//        }
//    }
//    @Test
//    void getLetterResults_oneYellow(){
//        var guess = new GuessResult("zfzzz","false");
//        var expectedResult = new LetterResult[] {LetterResult.GRAY, LetterResult.YELLOW,
//        LetterResult.GRAY, LetterResult.GRAY, LetterResult.GRAY};
//        for (int i = 0; i <5; i++) {
//            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
//        }
//    }
//    @Test
//    void getLetterResults_multipleYellow(){
//        var guess = new GuessResult("pxxpx","apple");
//        var expectedResult = new LetterResult[] {LetterResult.YELLOW, LetterResult.GRAY,
//                LetterResult.GRAY, LetterResult.YELLOW, LetterResult.GRAY};
//        for (int i = 0; i <5; i++) {
//            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
//        }
//}
//    @Test
//    void getLetterResults_tooManyYellow(){
//        var guess = new GuessResult("pxxpp","apple");
//        var expectedResult = new LetterResult[] {LetterResult.YELLOW, LetterResult.GRAY,
//                LetterResult.GRAY, LetterResult.YELLOW, LetterResult.GRAY};
//        for (int i = 0; i <5; i++) {
//            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
//        }
//}
//    @Test
//    void getLetterResults_yellowAndGreen(){
//        var guess = new GuessResult("cheer","close");
//        var expectedResult = new LetterResult[] {LetterResult.GREEN, LetterResult.GRAY,
//                LetterResult.YELLOW, LetterResult.GRAY, LetterResult.GRAY};
//        for (int i = 0; i <5; i++) {
//            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
//        }
//    }
    @Test
    void getLetterResults_greenAndGray(){
        var guess = new GuessResult("cocks","close");
        var expectedResult = new LetterResult[] {LetterResult.GREEN, LetterResult.YELLOW,
                LetterResult.GRAY, LetterResult.GRAY, LetterResult.YELLOW};
        for (int i = 0; i <5; i++) {
            assertEquals(expectedResult[i], guess.getLetterResults()[i]);
        }
    }







}
