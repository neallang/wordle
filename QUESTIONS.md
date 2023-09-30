# Reflection Questions

Answer these questions thoroughly after completing the assignment, using examples from your code. Good answers will be 1-2 paragraphs that cite specific code examples and show a meaningful reflection on how your development went, and how it could be improved in the future.

## Question 1

 In the Black-Box testing for GameState.submitGuess() portion of the assignment, list the partitions of inputs and fields that you used for your test plan. Cite specific tests by name and line number that cover each partition. A bulleted list is acceptable here. You should include all of your tests covering at least one partition. Additionally, for each partition, label it is equivalence, boundary, or exception.

## Answer

Equivalence Partitions:
- line 66: public void submitGuess_ensureDecrement() - expected: 4, actual: game.getGuessesRemaining(); inputs: var game = new Game(defaultGuessesDictionary, "TREND", 5, PLAYING); game.submitGuess("poops");
- line 72: public void  submitGuess_ensurePlaying() - expected: PLAYING, actual: game.getGameStatus(); inputs: var game = new Game(defaultGuessesDictionary, "TREND", 5, PLAYING); game.submitGuess("poops");

Exception Partitions:
- line 45:  public void submitGuess_gameLost() - expected and receieved a GameAlreadyOverException.  inputs: var game = new Game(defaultGuessesDictionary, "TREND", 0, LOSS);  game.submitGuess("poops");
- line 50:   public void submitGuess_gameWon() - expected and receieved a GameAlreadyOverException.  inputs: var game = new Game(defaultGuessesDictionary, "TREND", 0, WIN); game.submitGuess("TREnd");
- line 56:  public void submitGuess_illegalWord() - expected and receieved a IllegalWordException.  inputs: var game = new Game(defaultGuessesDictionary, "TREND", 2, PLAYING); game.submitGuess("aaaaa");
  

## Question 2

The function submitGuess(String) in WordleGameState can throw two different Exceptions. Why would we as developers intentionally design our program to throw Exceptions? What is the benefit?

## Answer

Exceptions are used to provide the user with a meaningful message rather than presenting them with long error codes. If the message is meaningful, it provides the user with the exact problem with their
input and should only affect corresponding areas of code. Thus, they can easily learn from their mistake and re-enter an input. Exceptions are also very useful for a programmer when testing as they can
help identify errors and where those errors occur. This can be very useful in large projects and when other programmers are using someone else's code. Overall, exceptions provide a much cleaner and more
concise way to handle user errors.
