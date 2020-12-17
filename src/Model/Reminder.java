package Model;

public class Reminder {
    private String dayOfWeek;
    private int time;

    public Reminder() {
    }

    public Reminder(String dayOfWeek, int time) {
        this.dayOfWeek = dayOfWeek;
        this.time = time;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
