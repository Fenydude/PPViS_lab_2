package Model;

public class Achivement {
    private String name;
    private String exercise;
    private int currentProgress;
    private int aim;
    private boolean performed;

    public Achivement() {

    }

    public Achivement(String name, String exercise, int currentProgress, int aim, boolean performed) {
        this.name = name;
        this.exercise = exercise;
        this.currentProgress = currentProgress;
        this.aim = aim;
        this.performed = performed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }

    public int getAim() {
        return aim;
    }

    public void setAim(int aim) {
        this.aim = aim;
    }

    public boolean isPerformed() {
        return performed;
    }

    public void setPerformed(boolean performed) {
        this.performed = performed;
    }
}
