package CockyCoders;
/**
 * @author Alex
 */

import java.util.HashMap;

public class InputHandler {
    /**
     * calls to other classes to start a count down based on a number input by the user 
     */
    private HashMap<String, Command> commands;

    /**
     * uses a HashMap to call to other classes to output the countdown based on user input of 1,5,30, or q to quit
     * @param watch
     */
    public InputHandler(StopWatch watch) {
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }

    /**
     * creates parameters for the countdown to be executed based on user input
     * @param key
     * @return countdowns 
     */
    public boolean inputEntered(String key) {
        Command command = commands.get(key);
        if (command != null) {
            command.execute();
            return true;
        } else {
            return false;
        }
    }
}