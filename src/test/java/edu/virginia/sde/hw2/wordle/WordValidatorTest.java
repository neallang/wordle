package edu.virginia.sde.hw2.wordle;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordValidatorTest {
    private static WordValidator wordValidator;
    @BeforeAll
    public static void initialize() {
        wordValidator = new WordValidator();
    }
    @Test
    public void isValidWord_false_tooLong() {
        assertFalse(wordValidator.isValidWord("DOGGIE"));
    }
    @Test void isCorrectLength_shouldBeTrue() {     //this test proved isCorrectLength() was wrong. Now I fix.
        var WordValidator = new WordValidator();
        assertTrue(WordValidator.isCorrectLength("apple"));
    }
    @Test void isAllLetters_shouldBeTrue() {
        var WordValidator = new WordValidator();
        assertTrue(WordValidator.isValidWord("hello"));
    }
    @Test void isAllLetters_shouldBeFalse() {
        var WordValidator = new WordValidator();
        assertFalse(WordValidator.isValidWord("hel3lo"));
    }
    @Test void isValidWord_shouldBeTrue() {
        var WordValidator = new WordValidator();
        assertTrue(WordValidator.isValidWord("apple"));
    }
    @Test void isValidWord_shouldBeFalse_containsNum() {
        var WordValidator = new WordValidator();
        assertFalse(WordValidator.isValidWord("app4e"));
    }
    @Test void isValidWord_shouldBeFalse_moreThanFive() {
        var WordValidator = new WordValidator();
        assertFalse(WordValidator.isValidWord("applie"));
    }
}
