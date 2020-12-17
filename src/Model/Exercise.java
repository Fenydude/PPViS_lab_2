package Model;

public class Exercise {
    private String name;
    private int duration;
    private int numberOfRepetitions;

    public static int totalAmountOfExercisePerformed = 0;

    public Exercise(String name, int duration, int numberOfRepetitions) {
        this.name = name;
        this.duration = duration;
        this.numberOfRepetitions = numberOfRepetitions;
    }

    public Exercise() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(int numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }
}
