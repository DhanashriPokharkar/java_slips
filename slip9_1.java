/*
 * Define a “Clock” class that does the following ;
    a. Accept Hours, Minutes and Seconds
    b. Check the validity of numbers
    c. Set the time to AM/PM mode
    Use the necessary constructors and methods to do the above task
 */

class Clock {
    int hr, mins, sec, mode;

    Clock(int hr, int mins, int sec, int mode) {

        if (hr >= 0 && hr <= 24 && mins >= 0 && mins <= 60 && sec >= 0 && sec <= 60 && (mode == 1 || mode == 2)) {
            this.hr = hr;
            this.mins = mins;
            this.sec = sec;
            this.mode = mode;
        }
    }

    void getTime() {
        System.out.println("Time is " + hr + ":" + mins + ":" + sec + " " + (mode == 1 ? "am" : "pm"));
    }
}

public class slip9_1 {
    public static void main(String args[]) {
        Clock c = new Clock(7, 25, 00, 1);
        c.getTime();
    }
}
