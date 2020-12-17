package Manager;

import java.util.List;

public class TrainingPlansManager {
    private List<TrainingPlan> trainingPlans;
    private int numberOfWorkouts;
    private String intensity;

    public TrainingPlansManager(List<TrainingPlan> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }

    public TrainingPlansManager(List<TrainingPlan> trainingPlans, int numberOfWorkouts, String intensity) {
        this.trainingPlans = trainingPlans;
        this.numberOfWorkouts = numberOfWorkouts;
        this.intensity = intensity;
    }

    public TrainingPlansManager() {
    }

    public List<TrainingPlan> getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(List<TrainingPlan> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }

    public int getNumberOfWorkouts() {
        return numberOfWorkouts;
    }

    public void setNumberOfWorkouts(int numberOfWorkouts) {
        this.numberOfWorkouts = numberOfWorkouts;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public void addTrainingPlan(TrainingPlan trainingPlan){

    }

    public void deleteTrainingPlan(TrainingPlan trainingPlan){

    }
    public void nextTrainingPlan(){

    }

    public void training(TrainingPlan trainingPlan){

    }
}
