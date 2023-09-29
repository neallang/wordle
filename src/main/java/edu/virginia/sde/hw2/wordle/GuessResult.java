package edu.virginia.sde.hw2.wordle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

import static edu.virginia.sde.hw2.wordle.LetterResult.*;

/**
 * This class handles getting the result from a guess in a Wordle Game. This class is used by
 * {@link Game#submitGuess(String)}.
 */
public class GuessResult {
    private final String guess;
    private final String answer;

    /**
     * Constructor for GuessResult
     *
     * @param guess  - the Wordle player's guessed word
     * @param answer - the word the player is trying to guess
     * @throws IllegalArgumentException if either word is not 5-characters long.
     */
    public GuessResult(String guess, String answer) {
        validateWordLengths(guess, answer);
        this.guess = guess;
        this.answer = answer;
    }

    private static void validateWordLengths(String guess, String answer) {
        if (guess.length() != WordValidator.WORDLE_WORD_LENGTH || answer.length() != WordValidator.WORDLE_WORD_LENGTH) {
            throw new IllegalArgumentException(String.format("""
                            Invalid GuessResult initialization:
                                guess: %s
                                answer: %s
                            Words must be %d letters long.""",
                    guess, answer, WordValidator.WORDLE_WORD_LENGTH));
        }
    }

    /**
     * Returns the guess submitted by the player.
     */
    public String getGuess() {
        return guess;
    }

    /**
     * Returns the answer the player is trying to guess.
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Returns true if the player's guess matches the answer (case-insensitive)
     */
    public boolean isCorrect() {
        if (this.guess.equals(this.answer)) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<Character, Integer> letterCounter(String answer) {
        HashMap<Character, Integer> numLetterCount = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            char letter = answer.charAt(i);
            if (!numLetterCount.containsKey(letter)) {
                numLetterCount.put(letter, 1);
            } else {
                numLetterCount.put(letter, numLetterCount.get(letter) + 1); //second param represents number of occurences
            }
        }
        return numLetterCount;
    }

    /**
     * Returns the {@link LetterResult} array of GREEN, YELLOW, and GRAY based on how well the player's guess. This
     * function is case-insensitive.
     */
    public LetterResult[] getLetterResults() {
        //TODO: Stub
        String guess = getGuess();
        String answer = getAnswer();
        LetterResult[] returnList = new LetterResult[5];
        HashMap<Character, Integer> letterMap = letterCounter(answer);
        for (int i = 0; i < 5; i++) {
            char answerLetter = answer.charAt(i);
            char guessLetter = guess.charAt(i);
            if (guessLetter == answerLetter) {
                returnList[i] = GREEN;
                letterMap.put(guessLetter, letterMap.get(guessLetter) - 1);

            }
            if (!answer.contains(String.valueOf(guessLetter))) {
                returnList[i] = GRAY;
            }

            if (letterMap.containsKey(guessLetter) && returnList[i] != GREEN) {
                if (letterMap.get(guessLetter) >= 1) {
                    returnList[i] = YELLOW;
                    letterMap.put(guessLetter, letterMap.get(guessLetter) - 1);
                }
                else {
                    returnList[i] = GRAY; //may not be gray
                }

            }



            }
        return returnList;
        }
}
