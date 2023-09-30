[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/v1t_usYi)
# Homework 2 - Testing

## Authors
1) Neal Langhorne, yhn5yh, neallang
2) Name, netid, [GitHub profile name]

## To Run

[Add a brief description of how to build and run your .jar file based on this code]

## Contributions

List the primary contributions of each author. It is recommended to update this with your contributions after each coding session.:

### Neal Langhorne
* to be entered

### [Author 2 - replace this with their name]

* Author 2 contributions
* as a bulleted list
* each line starts with an asterisk and a space

## Issues

1. This is not necessarily an issue, but an assumption. We noticed that the validateWordLengths() method is void, and thus cannot be checked by the constructor. We wanted to say if there is an invalid length,
do not set the guess/answer. However, given that this method is void and the method signature cannot be altered, we left it so it throws an exception but still sets the guess/answer (no other option). We carried
the same logic over for our validateAllLetters() method, which is very similar but simply ensures that everything is a letter. Please understand this as we wanted to change validateWordLengths() to return a boolean
but had no other choice. We had a very similar situation for the dictionary constructor (calling the validateWordSet() method) so please refer to this note for that as well.  Thank you!

2. Another note to leave is that we wrote a few tests that were specifically designed to fail. However, we noticed on the instructions that all tests should be passing when run, so we commented these out and
left a note that these tests were designed to fail. Thank you!

