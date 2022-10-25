class Time {
    private int hour; // 0 ~ 23
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (isValidHour(hour)) return;
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private static boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

public class TimeTest {
    public static void main(String[] args) {

        Time t = new Time(12, 35, 30);
        System.out.println(t);
        // t.hour = 13;
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }
}
