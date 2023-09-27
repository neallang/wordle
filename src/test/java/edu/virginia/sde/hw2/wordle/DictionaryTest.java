package edu.virginia.sde.hw2.wordle;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    @Test
    void getWordSet() {
        var startingWordSet = new HashSet<>(Set.of("apple", "black", "camel"));
        var dictionary = new Dictionary(startingWordSet, new WordValidator());

        var wordSet = dictionary.getWordSet();
        assertEquals(3, wordSet.size());
        assertTrue(wordSet.contains("apple"));
        assertTrue(wordSet.contains("black"));
        assertTrue(wordSet.contains("camel"));
    }
    @Test
    void getWordSet_initiallyEmpty() {
        var dictionary = new Dictionary();

        var wordSet = dictionary.getWordSet();
        assertTrue(wordSet.isEmpty());
    }

    @Test void constructor_sizeCheck(){
        var startingWordSet = new HashSet<>(Set.of("apple"));
        var dictionary = new Dictionary(startingWordSet, new WordValidator());
        assertEquals(1, dictionary.size());
    }
    @Test void addWord_sizeCheck(){
        var startingWordSet = new HashSet<>(Set.of("apple"));
        var dictionary = new Dictionary(startingWordSet, new WordValidator());
        dictionary.addWord("hello");
        assertEquals(2, dictionary.size());
    }
    @Test void addWord_validWord(){
        var startingWordSet = new HashSet<>(Set.of("apple"));
        var dictionary = new Dictionary(startingWordSet, new WordValidator());
        dictionary.addWord("hello3");
        assertEquals(1, dictionary.size());
    }
    @Test void contains_caseCheck(){
        var startingWordSet = new HashSet<>(Set.of("apple"));
        var dictionary = new Dictionary(startingWordSet, new WordValidator());
        dictionary.addWord("hello");
        assertTrue(dictionary.contains("HElLo"));
    }
    @Test void equals_check(){
        var dictionary = new Dictionary();
        var dictionary2 = new Dictionary();

        dictionary.addWord("Hello");
        dictionary.addWord("FivEs");
        dictionary2.addWord("helLo");
        dictionary2.addWord("FIVes");

        assertTrue(dictionary.equals(dictionary2));
        assertTrue(dictionary.size() == dictionary2.size());
    }
    @Test void equals_checkFalse(){
        var dictionary = new Dictionary();
        var dictionary2 = new Dictionary();

        dictionary.addWord("Hello");
        dictionary.addWord("FivEs");
        dictionary2.addWord("helLo");
        dictionary2.addWord("FIVes");
        dictionary2.addWord("PhoNe");

        assertFalse(dictionary.equals(dictionary2));
    }




    //WORDVALIDATOR TESTS

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