public class Clock {
    public static int hours;
    public static int minutes;
    public static int seconds;

    public Clock() {
        hours = 12;
    }

    public Clock(int h, int m, int s) {
        if (h >= 0 && h <= 23)
            hours = h;
        if (m >= 0 && m <= 59)
            minutes = m;
        if (s >= 0 && s <= 59)
            seconds = s;
    }

    public Clock(int s) {
        hours = s / 3600;
        s %= 3600;
        minutes = s / 60;
        s %= 60;
        seconds=s;
    }

    public void setClock(int s) {
        hours = s / 3600;
        s %= 3600;
        minutes = s / 60;
        s %= 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int h) {
        if (h >= 0 && h <= 23)
            hours = h;
    }

    public void setMinutes(int m) {
        if (m >= 0 && m <= 59)
            minutes = m;
    }

    public void setSeconds(int m) {
        if (m >= 0 && m <= 59)
            seconds = m;
    }

    public void tick() {
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
            }
        }

    }

    public void addClock(Clock n) {
        int s = seconds + n.getSeconds();
        if (s >= 0 && s <= 59) {
            seconds += n.getSeconds();
        } else {

            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
            }

        }
        int m = minutes + n.getMinutes();
        if (m >= 0 && m <= 59) {
            minutes += n.getMinutes();
        } else {
            minutes = 0;
            hours++;
        }

        int h = hours + n.getHours();
        if (h >= 0 && h <= 23) {
            hours += n.getHours();
        }


    }

    public String toString() {
        String s = "(";

        if(hours>9){
            s+=hours;
        } else {
            s+="0";
            s+=hours;
        }
        s+=":";
        if(minutes>9){
            s+=minutes;
        } else {
            s+="0";
            s+=minutes;
        }
        s+=":";
        if(seconds>9){
            s+=seconds;
        } else {
            s+="0";
            s+=seconds;
        }
        s+=")";
        return s;
    }

    public void tickDown() {

        seconds--;
    }

    public Clock subtractClock(Clock n) {
        Clock c=new Clock();
        int seconds=0;
        int minutes=0;
        int hours=0;
        int s = seconds - n.getSeconds();
        if (s >= 0 && s <= 59) {
            seconds -= n.getSeconds();
        } else {

            seconds = 59;
            minutes--;
            if (minutes <0) {
                minutes = 59;
                hours--;
            }

        }
        int m = minutes - n.getMinutes();
        if (m >= 0 && m <= 59) {
            minutes -= n.getMinutes();
        } else {
            minutes = 59;
            hours--;
        }

        int h = hours - n.getHours();
        if (h >= 0 && h <= 23) {
            hours -= n.getHours();
        }
        c.setHours(hours);
        c.setMinutes(minutes);
        c.setSeconds(seconds);

        return c;


    }
}
