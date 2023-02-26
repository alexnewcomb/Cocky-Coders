package CockyCoders;
/**
 * @author Alex
 */

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(StopWatch watch) {
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }

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