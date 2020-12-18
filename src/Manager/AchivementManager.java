package Manager;

import Model.Achivement;

import java.util.ArrayList;
import java.util.List;

public class AchivementManager {
    private List<Achivement> completedAchivements;
    private List<Achivement> expectedAchivements;

    public AchivementManager(List<Achivement> completedAchivements, List<Achivement> expectedAchivements) {
        this.completedAchivements = completedAchivements;
        this.expectedAchivements = expectedAchivements;
    }

    public AchivementManager() {
        expectedAchivements = new ArrayList<>();
        completedAchivements = new ArrayList<>();
    }

    public List<Achivement> getCompletedAchivements() {
        return completedAchivements;
    }

    public void setCompletedAchivements(List<Achivement> completedAchivements) {
        this.completedAchivements = completedAchivements;
    }

    public List<Achivement> getExpectedAchivements() {
        return expectedAchivements;
    }

    public void setExpectedAchivements(List<Achivement> expectedAchivements) {
        this.expectedAchivements = expectedAchivements;
    }

    public void addAchivement(Achivement achivement){
        expectedAchivements.add(achivement);
    }
    public void deleteAchivement(Achivement achivement){
        moveToCompletedList(achivement);
        expectedAchivements.remove(achivement);
    }
    public void moveToCompletedList(Achivement achivement){
        completedAchivements.add(achivement);
    }

}
