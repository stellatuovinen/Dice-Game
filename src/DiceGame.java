import java.util.Scanner;

public class DiceGame {

	  String title = "Roll the Dice";
	  int turnCount = 0;

	  /*
	   *  The human player of the game. 
	   */
	  Player player = new Player();

	  /*
	   * Determines whether the game is over.
	   * @return `true` if the player has quit; `false` otherwise
	   */
	  public boolean isOver() {
		 return this.player.hasQuit();
	  }
	  
	  /*
	   * Prints out a message that is to be displayed to the player at the beginning of the game.
	   */
	  private void printWelcome() {
	    System.out.println("Welcome to Roll the Dice. You are playing against the computer. Guess a sum of two dice.");
	    System.out.println("You can quit using the command 'quit'.\n");
	  }
	  
	  /*
	   * Prints out a message that is to be displayed to the player at the end of the game.
	   */
	  private void printGoodbye() {
	    System.out.println("Thank you for playing!"); 
	  }  
	  
	  /*
	   * Runs the game. First, a welcome message is printed, then the player gets the chance 
	   * to play any number of turns until the game is over, and finally a goodbye message is printed.
	   */
	  public void run()  {
	    this.printWelcome();
	    do {
            if (this.isOver()) {
                this.printGoodbye();
                return;
            }
            this.playTurn();
        } while (true);
	  }
	  
	  /*
	   * Requests a command from the player, plays a game turn accordingly,
	   * and prints out a report of what happened. 
	   */
	  private void playTurn() {
	    System.out.println();	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Command: ");
	    String command = scanner.next();    
	    Action action = new Action(command);

	    if (action.execute(this.player)) {
	    	this.turnCount += 1;
	    }
	  }
	  
}
	
	
	
	

