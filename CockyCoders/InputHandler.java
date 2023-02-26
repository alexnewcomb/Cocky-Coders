/*
 * Author: Alex
 */
import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Integer> commands;
    public InputHandler(StopWatch watch) {
        commands = new HashMap<String, Integer>();
        commands.put("1", 60);
        commands.put("5", 300);
        commands.put("30", 30);
    }
    public int inputEntered(String command) {
        if(commands.containsKey(command)) {
            return commands.get(command);
        }
        return 0;
    }
}
