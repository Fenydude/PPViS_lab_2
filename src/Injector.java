import Controller.MainController;
import Manager.AchivementManager;
import Manager.ReminderManager;
import Manager.TrainingPlan;
import Manager.TrainingPlansManager;
import Model.Achivement;
import Model.Button.*;
import Model.Exercise;
import Model.HockeyPlayer;
import Model.Reminder;
import View.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class Injector {
    public void create(){

        Exercise runExercise = new Exercise("Run",30,1);
        Exercise jumpExercise = new Exercise("Jump",3,3);
        Exercise swimExercise = new Exercise("Swim",30,1);
        Exercise bicycleExercise = new Exercise("Bicycle", 3,5);

        List<Exercise> exercises = new ArrayList<>();
        exercises.add(runExercise);
        exercises.add(swimExercise);
        exercises.add(jumpExercise);
        exercises.add(bicycleExercise);

        TrainingPlan trainingPlanOnMonday = new TrainingPlan(exercises,"Первый день",2,0,10);

        List<TrainingPlan> trainingPlans = new ArrayList<>(7);
        trainingPlans.add(trainingPlanOnMonday);


        HockeyPlayer hockeyPlayer = new HockeyPlayer();
        TrainingPlansManager trainingPlansManager = new TrainingPlansManager(trainingPlans);
        AchivementManager achivementManager = new AchivementManager();
        ReminderManager reminderManager = new ReminderManager();

        Reminder firstRem = new Reminder("Понедельник","19:04");
        Reminder secondRem = new Reminder("Пятница", "13:30");

        reminderManager.addReminder(firstRem);
        reminderManager.addReminder(secondRem);

        Achivement firstAch = new Achivement("Скорость","Бег",0,100,false);
        Achivement secondAch = new Achivement("Лягушка","Прыжки",0,100,false);
        achivementManager.addAchivement(firstAch);
        achivementManager.addAchivement(secondAch);
        MainController controller = new MainController(hockeyPlayer,trainingPlansManager,achivementManager,reminderManager);




        UserInterface userInterface = new UserInterface(controller);
        userInterface.addButton(new MainMenuButton());
        userInterface.addButton(new TrainingPlanButton());
        userInterface.addButton(new AchievementsButton());
        userInterface.addButton(new AddButton());
        userInterface.addButton(new BackButton());
        userInterface.addButton(new DeleteButton());
        userInterface.addButton(new EditButton());
        userInterface.addButton(new ExitButton());
        userInterface.addButton(new FinishWorkoutButton());
        userInterface.addButton(new HockeyPlayerButton());
        userInterface.addButton(new ReminderButton());
        userInterface.addButton(new SaveButton());
        userInterface.showMainMenu();
    }
}
