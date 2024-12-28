# Guess the Number Game

## Overview
The **Guess the Number Game** is a simple Java program designed to challenge players to guess a randomly generated number between 0 and 99. It provides feedback after each guess, helping players narrow down their options until they find the correct number. This project is great for beginners looking to practice Java programming concepts like random number generation, user input handling, and control flow.

## Features
- **Random Number Generation:** The program generates a random number between 0 and 99 each time it runs.
- **User Input Handling:** Players can input their guesses using the console.
- **Feedback System:** The program provides feedback after each guess:
  - "Too Low..." if the guess is less than the target number.
  - "Too High..." if the guess is greater than the target number.
  - "Yes, you guessed it right!" when the guess matches the target number.
- **Attempt Tracking:** The program keeps track of how many guesses it took to find the correct number.

## How to Run
1. **Prerequisites:**
   - Java Development Kit (JDK) installed on your system.
   - Basic knowledge of running Java programs from the command line.

2. **Steps to Run:**
   - Clone or download the project files.
   - Open a terminal or command prompt.
   - Navigate to the directory containing `Guess_the_numbers.java`.
   - Compile the program using the command:
     ```
     javac Guess_the_numbers.java
     ```
   - Run the program using the command:
     ```
     java Guess_the_numbers
     ```

3. **Gameplay Instructions:**
   - The program will prompt you to guess a number.
   - Enter your guess and press Enter.
   - Keep guessing until the program confirms you have guessed the correct number.

## Code Structure
- **`Games` Class:**
  - Handles the game's logic, including random number generation, user input, and feedback.
  - Tracks the number of guesses made by the player.
- **`Guess_the_numbers` Class:**
  - Contains the `main` method to run the game.
  - Manages the game loop until the player guesses the correct number.

## Example Output
Guess the number: 50
Too High...
Guess the number: 25
Too Low...
Guess the number: 37
Yes, you guessed it right! It was 37.
You guessed it in 3 attempts.

*Future Enhancements
- Add a feature to allow players to choose the range of numbers.
- Implement a scoring system based on the number of attempts.
- Create a graphical user interface (GUI) for better user experience.
- Add difficulty levels (e.g., Easy, Medium, Hard).

*Contributing
Contributions are welcome! Feel free to fork this repository and submit a pull request with your improvements or ideas.

*License
This project is open-source and available under the MIT License.

*Acknowledgments
This project was built as a fun way to practice Java programming. Thanks for checking it out!


