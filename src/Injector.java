import Model.Button.*;
import View.UserInterface;

public class Injector {
    public void create(){
        UserInterface userInterface = new UserInterface();
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
