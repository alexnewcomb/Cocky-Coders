package CockyCoders;

/**
 * @author Jose
 */

public class OneMinCommand implements Command {
        
        private StopWatch watch;

        /*
         * execute method for One Minute command
         * @param watch
         */
        public OneMinCommand(StopWatch watch) {
                this.watch = watch;
        }

        @Override 
        public void execute() {
                watch.countDownOneMin();;
        }

}