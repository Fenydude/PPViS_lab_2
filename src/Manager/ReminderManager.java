package Manager;

import Model.Reminder;

import java.util.ArrayList;
import java.util.List;

public class ReminderManager {
    private List<Reminder> expectedReminders;

    public ReminderManager(){
        expectedReminders = new ArrayList<>();
    }

    public ReminderManager(List<Reminder> expectedReminders) {
        this.expectedReminders = expectedReminders;
    }

    public List<Reminder> getExpectedReminders() {
        return expectedReminders;
    }

    public void setExpectedReminders(List<Reminder> expectedReminders) {
        this.expectedReminders = expectedReminders;
    }


    public void addReminder(Reminder reminder){
        expectedReminders.add(reminder);
    }
}
