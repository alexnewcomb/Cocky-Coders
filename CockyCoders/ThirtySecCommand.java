package CockyCoders;

/**
 * @author Zoe McCuen
 */

public class ThirtySecCommand implements Command {
    /**
     * this sets up the count down for 30 seconds based on the StopWatch class and the execute method
     */
    private StopWatch watch;
    
    /**
     * this takes the command and then executes the method from StopWatch
     * @param watch
     */
    public ThirtySecCommand(StopWatch watch) {
        this.watch = watch;
    }

    @Override
    public void execute() {
        watch.countDownThirtySec();
    }
}
