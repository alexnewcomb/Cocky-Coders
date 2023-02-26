package CockyCoders;

/*
 * Author: Jose
 */

public class OneMinCommand implements Command {
        private StopWatch watch;

        //starting point 
        public OneMinCommand(StopWatch watch) {
                this.watch = watch;
        }

        @Override 
        public void execute() {
                watch.countDownOneMin();;
        }

}