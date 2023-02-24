/*
 * Author: Jose
 */

public class FiveMinCommand implements Command {
        private StopWatch watch;

        //starting point
        public FiveMinCommand(StopWatch watch) {
                this.watch = watch;
        }

        @Override 
        public void execute() {
                watch.five();
        }
 
}
