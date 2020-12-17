package Manager;

import Model.Exercise;

import java.util.List;

public class TrainingPlan {
    private List<Exercise> exercises;
    private String dayOfWeek;
    private int amountOfApproaches;
    private int numberOfApproaches;
    private int timeForRelax;

    public TrainingPlan() {
    }

    public TrainingPlan(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public TrainingPlan(List<Exercise> exercises, String dayOfWeek, int amountOfApproaches, int numberOfApproaches, int timeForRelax) {
        this.exercises = exercises;
        this.dayOfWeek = dayOfWeek;
        this.amountOfApproaches = amountOfApproaches;
        this.numberOfApproaches = numberOfApproaches;
        this.timeForRelax = timeForRelax;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getAmountOfApproaches() {
        return amountOfApproaches;
    }

    public void setAmountOfApproaches(int amountOfApproaches) {
        this.amountOfApproaches = amountOfApproaches;
    }

    public int getNumberOfApproaches() {
        return numberOfApproaches;
    }

    public void setNumberOfApproaches(int numberOfApproaches) {
        this.numberOfApproaches = numberOfApproaches;
    }

    public int getTimeForRelax() {
        return timeForRelax;
    }

    public void setTimeForRelax(int timeForRelax) {
        this.timeForRelax = timeForRelax;
    }

    public void executeApproach(){

    }
    public void addExercise(Exercise exercise){

    }
    public void deleteExercise(Exercise exercise){

    }
}
