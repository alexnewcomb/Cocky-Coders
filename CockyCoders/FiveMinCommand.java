package CockyCoders;

/*
 * @author Jose
 */

public class FiveMinCommand implements Command {
        
        private StopWatch watch;

        /*
         * execute method for Five Minute command
         * @param watch
         */
        public FiveMinCommand(StopWatch watch) {
                this.watch = watch;
        }

        @Override 
        public void execute() {
                watch.countDownFiveMin();
        }
 
}
