import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {

	/*
	 * A `Player` object represents a player character controlled by the real-life user of the program. 
	 */
	  boolean quitCommandGiven = false;
	  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	  int randomSum = 0;
	  int guess = 0;
	  
	  /*
	   * Determines if the player has indicated a desire to quit the game.
	   */
	  public boolean hasQuit() {
		 return this.quitCommandGiven;
	 }
	  
	  /**
	   * Stores the guessed sum of the player and gives further instructions.
	   */
	  
	  public void go(int guessed) { 
	    this.guess = guessed;
	    System.out.println("Your guess is " + guessed + ". Guess again or 'roll'.");
	  }
	  
	  /*
	   * Rolls the two dice and informs the player of the result of the round.
	   */
	  public void roll() {    
	   int random1 = new Random().nextInt(6);
	   int random2 = new Random().nextInt(6);
	   int randomSum = numbers.get(random1) + numbers.get(random2);
	  
	   if (guess == randomSum) {
	      System.out.println("Congratulations, you won! Your guess was " + guess + ".");
	      System.out.println("You rolled a " + numbers.get(random1) + " and a " + numbers.get(random2) + ".");
	    } else if (guess == 0){
	      System.out.println("Please guess a sum of two dice before rolling.");  
	    } else {
	      System.out.println("Ah, incorrect! Your guess was: " + guess);
	      System.out.println("You rolled a " + numbers.get(random1) + " and a " + numbers.get(random2) + ".");
	      System.out.println("The correct sum: " + randomSum + "\n");
	      System.out.println("Continue playing by rolling again or by guessing another sum. You can 'quit' at any time.");
	    }  
	  }
	  
	  /*
	   * Signals that the player wants to quit the game.
	   */
	  public void quit() {
	    this.quitCommandGiven = true;
	  } 
	 
	  
}

	
	

