package Controller;

import Manager.AchivementManager;
import Manager.ReminderManager;
import Manager.TrainingPlan;
import Manager.TrainingPlansManager;
import Model.Achivement;
import Model.Exercise;
import Model.HockeyPlayer;
import Model.Reminder;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    public HockeyPlayer hockeyPlayer;
    public TrainingPlansManager trainingPlansManager;
    public AchivementManager achivementManager;
    public ReminderManager reminderManager;

    public MainController() {
    }

    public MainController(HockeyPlayer hockeyPlayer, TrainingPlansManager trainingPlansManager, AchivementManager achivementManager, ReminderManager reminderManager) {
        this.hockeyPlayer = hockeyPlayer;
        this.trainingPlansManager = trainingPlansManager;
        this.achivementManager = achivementManager;
        this.reminderManager = reminderManager;
    }

    public void createTrainingPlan() {
        //Тут должна быть логика по которой исходя из данных хоккеиста строится план тренировок
        TrainingPlan trainingPlanOnTuesday = new TrainingPlan(trainingPlansManager.getTrainingPlans().get(0).getExercises(), "Второй день", 5, 0, 7);
        TrainingPlan trainingPlanOnWednesday = new TrainingPlan(trainingPlansManager.getTrainingPlans().get(0).getExercises(), "Третий день", 6, 0, 6);
        TrainingPlan trainingPlanOnThursday = new TrainingPlan(trainingPlansManager.getTrainingPlans().get(0).getExercises(), "Четвертый день", 4, 0, 10);
        TrainingPlan trainingPlanOnFriday = new TrainingPlan(trainingPlansManager.getTrainingPlans().get(0).getExercises(), "Пятый день", 5, 0, 9);
        TrainingPlan trainingPlanOnSaturday = new TrainingPlan(trainingPlansManager.getTrainingPlans().get(0).getExercises(), "Шестой день", 2, 0, 5);
        TrainingPlan trainingPlanOnSunday = new TrainingPlan(trainingPlansManager.getTrainingPlans().get(0).getExercises(), "Седьмой день", 2, 0, 5);
        trainingPlansManager.addTrainingPlan(trainingPlanOnTuesday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnWednesday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnThursday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnFriday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnSaturday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnSunday);
    }

    public void checkHockeyPlayerInfo(HockeyPlayer hockeyPlayer) {
        //Тут должна быть определенная проверка по параметрам человека подзодит ли он для тренировок
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        if (currentYear - hockeyPlayer.getYearOfBirth() > 16) {
            this.hockeyPlayer = hockeyPlayer;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void checkCreateTrainingPlan(HockeyPlayer hockeyPlayer) {
        //Проверяет тренировки согласно параметрам человека
        trainingPlansManager.getTrainingPlans().clear();
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        List<Exercise> exercises = new ArrayList<>();

        if (currentYear - hockeyPlayer.getYearOfBirth() > 21) {
            Exercise runExercise = new Exercise("Run", 30, 0);
            Exercise jumpExercise = new Exercise("Jump", 0, 20);
            Exercise swimExercise = new Exercise("Swim", 30, 0);
            Exercise bicycleExercise = new Exercise("Bicycle", 5, 0);


            exercises.add(runExercise);
            exercises.add(swimExercise);
            exercises.add(jumpExercise);
            exercises.add(bicycleExercise);
        }else {
            Exercise runExercise = new Exercise("Run", 30, 0);
            Exercise jumpExercise = new Exercise("Jump", 0, 20);
            Exercise swimExercise = new Exercise("Swim", 30, 0);


            exercises.add(runExercise);
            exercises.add(swimExercise);
            exercises.add(jumpExercise);
        }
        TrainingPlan trainingPlanOnMonday = new TrainingPlan(exercises, "Первый день", 2, 0, 10);
        TrainingPlan trainingPlanOnTuesday = new TrainingPlan(exercises, "Второй день", 5, 0, 7);
        TrainingPlan trainingPlanOnWednesday = new TrainingPlan(exercises, "Третий день", 6, 0, 6);
        TrainingPlan trainingPlanOnThursday = new TrainingPlan(exercises, "Четвертый день", 4, 0, 10);
        TrainingPlan trainingPlanOnFriday = new TrainingPlan(exercises, "Пятый день", 5, 0, 9);
        TrainingPlan trainingPlanOnSaturday = new TrainingPlan(exercises, "Шестой день", 2, 0, 5);
        TrainingPlan trainingPlanOnSunday = new TrainingPlan(exercises, "Седьмой день", 2, 0, 5);

        trainingPlansManager.addTrainingPlan(trainingPlanOnMonday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnTuesday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnWednesday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnThursday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnFriday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnSaturday);
        trainingPlansManager.addTrainingPlan(trainingPlanOnSunday);
    }

    public void startTraining(TrainingPlan trainingPlan){
        trainingPlansManager.training(trainingPlan);
    }

    public void finishTraining(TrainingPlan trainingPlan){
        trainingPlansManager.deleteTrainingPlan(trainingPlan);
    }

    public void addReminder(Reminder reminder){
        reminderManager.addReminder(reminder);
    }

    public void deleteReminder(Reminder newReminder){
        reminderManager.getExpectedReminders().removeIf(reminder -> reminder.equals(newReminder));
    }

    public void updateAchive(){
        for (Achivement achivement : achivementManager.getExpectedAchivements()){
            for (TrainingPlan trainingPlan : trainingPlansManager.getTrainingPlans()){
                for (Exercise exercise : trainingPlan.getExercises()){
                    if (achivement.getExercise().equals(exercise.getName())){
                        achivement.setCurrentProgress(exercise.getNumberOfRepetitions());

                        if (achivement.getCurrentProgress() >= achivement.getAim()){
                            achivementManager.moveToCompletedList(achivement);
                        }
                    }
                }
            }
        }
    }
}
