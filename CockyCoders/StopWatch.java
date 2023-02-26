package CockyCoders;

import java.util.concurrent.TimeUnit;

/**
 * Creates a digital representation of a StopWatch
 * @author Storm
 */
public class StopWatch {
    
    /**
     * Initialize StopWatch
     */
    public StopWatch() {
        
    }

    /**
     * Allows the StopWatch to count down from one minute to zero.
     */
    public void countDownOneMin() {
        for(int i = 59; i >= 0; i--) {
            try {
                if(i > 9) {
                    System.out.println("00:"+i);
                }
                if(i <= 9) {
                    System.out.println("00:0"+i);
                }
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Allows the StopWatch to count down from five minutes to zero.
     */
    public void countDownFiveMin() {
        for(int i = 4; i >= 0; i--) {
            for(int j = 59; j >= 0; j--)
            try {
                if(j > 9) {
                    System.out.println("0"+i+":"+j);
                }
                if(j <= 9) {
                    System.out.println("0"+i+":"+"0"+j);
                }
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Allows the StopWatch to count down from thirty seconds to zero.
     */
    public void countDownThirtySec() {
        for(int i = 29; i >=0 ; i--) {
            try {
                if(i > 9) {
                    System.out.println("00:"+i);
                }
                if(i <= 9) {
                    System.out.println("00:0"+i);
                }
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
