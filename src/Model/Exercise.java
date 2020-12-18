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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercise exercise = (Exercise) o;

        if (duration != exercise.duration) return false;
        if (numberOfRepetitions != exercise.numberOfRepetitions) return false;
        return name != null ? name.equals(exercise.name) : exercise.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + duration;
        result = 31 * result + numberOfRepetitions;
        return result;
    }
}
