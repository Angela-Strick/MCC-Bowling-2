// Author: Maya Strickland
// Date: 10/11/2022
// About the program: This program will calculate the score of a bowling game based on the user's input for each frame.

import java.util.Scanner;

class Main {

  // List of variables used in this program
  public static int numberOfRolls;
  public static int maxPins = 10;
  public static int numberOfPins1;
  public static int numberOfPins2;
  public static int numberOfPins3;
  public static int numberOfPins4;
  public static int frame1Score;
  // public static int strikeBonus;
  public static int score = 0;
  // List of scanners
  public static Scanner input = new Scanner(System.in);

  // Method that prompts the user to enter in the scores from one frame

  public static void myGame() {
    int[] numberOfRolls = new int[21];
    System.out.println("Please enter the number of pins knocked down in roll 1: ");
    numberOfPins1 = input.nextInt();
    System.out.println("Please enter the number of pins knocked down in roll 2: ");
    numberOfPins2 = input.nextInt();
    if (numberOfPins1 + numberOfPins2 < maxPins) {
      frame1Score = numberOfPins1 + numberOfPins2;
      System.out.println("Your score is: " + frame1Score + " in frame 1");
      numberOfRolls[0] = numberOfPins1; // repeated code
      numberOfRolls[1] = numberOfPins2; // repeated code
    } else if (numberOfPins1 == 10) {
      System.out.println("You've got a strike! Your score for frame one will equal 10 + your next two rolls");
      numberOfRolls[0] = 10; // repeated code
      numberOfRolls[1] = 0; // repeated code
    } else if (numberOfPins1 + numberOfPins2 == maxPins) {
      numberOfRolls[0] = numberOfPins1; // repeated code
      numberOfRolls[1] = numberOfPins2; // repeated code
      System.out.println("You've got a spare! Your score for frame 1 will equal 10 + your next roll");
    } else if (numberOfPins1 > maxPins || numberOfPins1 < maxPins) {
      System.out.println("Invalid Number! Number can not exceed 10, silly!");

    } else {
      System.out.println(frame1Score);
    }
    System.out.println("Now Beginning Frame 2: ");
    System.out.println("");
    System.out.println("Please enter the number of pins knocked down in roll 1: ");
    numberOfPins3 = input.nextInt();
    System.out.println("Please enter the number of pins knocked down in roll 2: ");
    numberOfPins4 = input.nextInt();
    
  }

  public static void main(String[] args) {
    System.out.println("");
    System.out.println("****************Welcome to MCC Bowling!****************");
    System.out.println("");
    System.out.println("This program will calculate the score of a bowling game for one bowler.");
    System.out.println("");
    myGame();
  }
}

