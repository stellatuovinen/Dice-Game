public class Action {

	private String input;
	
	public Action(String input) {
		this.input = input.trim();
	}

	/**
	 * The class `Action` represents actions that a player may take in a text adventure game.
	 * `Action` objects are constructed on the basis of textual this.inputs and are, in effect, 
	 * parsers for such this.inputs. An action object is immutable after creation.
	 * 
	 * @param input   a textual in-game this.input such as "go east" or "rest"
	 */
	//  String this.input = input.trim(); //.trim.toLowerCase
	//  String verb      = this.input.takeWhile( _ != ' ' )
	//  String modifiers = this.input.drop(verb.length).trim

	  
	  /**
	   * Causes the given player to take the action represented by this object, assuming 
	   * that the this.input was understood.
	   *  
	   * @param actor   a player who is to take action
	   * @return `true` if the action was successful, `false` if the this.input was unknown 
	   */
	
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	  
	  public boolean execute(Player actor) {                               
	      if (this.input.equals("quit")) {
	      actor.quit();
	      return true;
	    } else if (this.input.equals("roll")){
	      actor.roll();
	      return true;     
	    } else if (isNumeric(input) == false) {
	      System.out.println("Unknown command: \"" + input + "\".");
		  return false; 
	    } else if (Integer.parseInt(this.input) < 13 && Integer.parseInt(this.input) > 1) {
	      actor.go(Integer.parseInt(this.input));
		  return true;
	    } else {
	    	return false;
	    }   
	}
	
}
