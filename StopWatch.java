import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Storm
 */
public class StopWatch {
    
    public StopWatch() {
        
    }

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
