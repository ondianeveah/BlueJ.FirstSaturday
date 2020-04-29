package BlueJ;

import java.util.concurrent.ThreadLocalRandom;

public class WriteLoops {
    private static final int _3 = 3;

    public int oneToFive() {
        int w = 0;
        for(int i = 1; i <= 5; i++){
            w = w + 1;
        }
        return w;
    }

    public int oneToTen() {
        int w = 0;
        for(int i = 1; i <= 10; i++){
            w = w + 1;
        }
        return w;

        // Write a FOR loop that counts from 1 to 10.
        // calling
        // each time through the loop
    }

    public int startAtTwentyOne() {
        int w = 0;
        for(int i = 21; i <= 31; i++){
            w = w + 1;
        }
        // Write a FOR loop that makes 10 iterations, start at 21.
        // calling
        // each time through the loop

        return w;
    }

    public int countDown() {
        int w = 0;
        for(int i = 100; i > 0; i--){
            w = w + 1;
        }
        return w;
    }


    public int countDownFrom5000() {
        int w = 0;
        for(int i = 1; i < 5001; i+=11){
            w = w + 1;
        }
        // Write a FOR loop from 1 to less than 5001 by 11s.
        // calling
        // each time through the loop

        return w;
    }

    public int nestedFors() {
        int w = 0;
        for(int i = 0; i < 20; i++){
            for(int x = 0; x <= 4; x++){
                w = w + 1;
            }
        }
        // Write a nested FOR loop(s), where one counts from
        // 0 to less than 20 and the inner one counts from 0 to 4
        // calling
        // w = w + 1;
        // each time through the inner loop

        return w;
    }

    public int helloZipCode() {
        int w = 0;
        for(int i = 5; i <= 105; i++){
            w = w + 1;
            if(i > 51){
                System.out.println("Hello Zipcode");
            }
        }
        // Write a FOR loop that counts from 5 to 105. Put an IF
        // statement inside the loop that checks the
        // loop index counter and if it’s greater than 51,
        // prints “Hello Zipcode” instead of the statement w = w + 1;

        // calling
        // each time through the inner loop

        return w;
    }

    public void simpleLoops() {
        int i = 0;
        // sample while loop
        while (i <= 5) {
            System.out.println("Eww.");
            i = i + 1;
        }

        // sample do...while loop
        i = 8;
        do {
            System.out.println("Eww.");
            i = i - 1;
        } while (i > 0);
        // what's the primary difference between them?!?
    }

    // Write a WHILE loop that checks “gpsCurrentLocation()”
    // and if that is not equal to “Home” then and it calls “driveSomeMore()”.
    // After the loop is done, print “Honey, I’m Home!”
    public int driveHome() {
        int w = 0;
        while(w <= 5){
            if(gpsCurrentLocation() != "Home"){
                driveSomeMore();
            }
            System.out.println("Honey, I'm Home!");
            w = w + 1;
        }
        // you need to use a .equals for two Strings.

        // calling
        // each time through the inner loop


        return w;
    }

    // Getting harder...
    // First declare and set “highestScore” to 236. Then set “currentScore” to
    // “gameNextScore()”. Then write a WHILE loop that checks "runningScore"
    // is less than “highestScore” and if it is, adds “currentScore” to
    // "runningScore"
    // and then sets “currentScore” to “gameNextScore()”
    public int checkGameScore() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        while(runningScore < highestScore){
            w = w + 1;
        }
        // do your while loop here

        // calling
        // each time through the inner loop

        return w;
    }

    // Rewrite the previous WHILE loop as a DO..WHILE loop.
    // Notice how the “runningScore” variable usage is different.
    public boolean checkGameScoreDoWhile() {
        int w = 0;
        int highestScore = 236;
        int currentScore = gameNextScore();
        int runningScore = 0;

        // do your while loop here

        // calling
        w = w + 1;
        // each time through the inner loop

        return w >= 3;
    }

    // Write a WHILE loop that checks “serverIsRunning()” and if true
    // calls “waitFor(5)” After the loop, write an IF and check “serverIsRunning()”
    // is false, and if so, call “sendEmergencyText(“Help!”, adminPhoneNumber)”
    // and also calls “tryServerRestart()”
    public int checkServerStatus() {
        int w = 0;
        String adminPhoneNumber = "+1 202 456 1111";

        while(serverIsRunning() == true){
            w = w + 1;
            waitFor(5);
        }if(serverIsRunning() == false){
            sendEmergencyText("Help", adminPhoneNumber);
            tryServerRestart("Help", adminPhoneNumber);
        }

        // calling
        // each time through the inner loop

        return w;
    }

    // Declare an “int” i. Set i to 7.
    // Write a WHILE loop that checks “i” is less than 50,
    // and if it is, add 7 to “i”

    /**
     * CONGRATS, you've written all the code. Does it all pass their tests?!?
     *
     *
     * If not, why not? :-)
     *
     *
     */

    /**
     * IGNORE the CODER behind the CURTAIN. These are the support routines to make
     * all the examples interesting.
     */
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BlueJ.WriteLoops
     */
    public WriteLoops() {
        // initialise instance variables
        x = 0;
    }

    private int gps = 0;

    private String gpsCurrentLocation() {
        if (this.gps > 5) {
            return "Home";
        }
        return "Not Home";
    }

    private void driveSomeMore() {
        this.gps += 1;
    }

    private int scr = 31;

    private int gameNextScore() {
        return this.scr = this.scr + ThreadLocalRandom.current().nextInt(20, 99 + 1);
    }

    private void yellAtJuniorToMowLawn() {
        /* dammit, mow the yard */}

    private void sendJuniorBackToSchool(String timeForSchool) {
        if (!timeForSchool.equalsIgnoreCase("First Day of School")) {
            throw new IllegalArgumentException();
        }
        /* dammit, mow the yard */}

    // private Supplier<Boolean> isSummer = () -> {
    //     int i = 0;
    //     return Supplier<Boolean> () -> {
    //         i = i + 1;
    //         return (i >= 3);
    //     };
    // };
    private int summer = 0;
    private boolean isSummer() {
        if (summer == 3) {
            return true;
        }
        summer++;
        return false;
    }
    private void sendEmergencyText(String mesg, String phone) {
    }

    private void tryServerRestart(String mesg, String phone) {
    }

    int serverStatus = 5;

    private boolean serverIsRunning() {
        return (serverStatus < 20);
    }

    private void waitFor(int interval) {
        serverStatus += interval;
    }
}
