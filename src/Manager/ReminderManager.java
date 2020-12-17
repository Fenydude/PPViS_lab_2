package Manager;

import Model.Reminder;

import java.util.List;

public class ReminderManager {
    private List<Reminder> reminders;

    public ReminderManager(){

    }

    public ReminderManager(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }
}
