package Manager;

import Model.Achivement;

import java.util.List;

public class AchivementManager {
    private List<Achivement> completedAchivements;
    private List<Achivement> expectedAchivements;

    public AchivementManager(List<Achivement> completedAchivements, List<Achivement> expectedAchivements) {
        this.completedAchivements = completedAchivements;
        this.expectedAchivements = expectedAchivements;
    }

    public AchivementManager() {
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

    }
    public void deleteAchivement(Achivement achivement){

    }
    public void moveToCompletedList(Achivement achivement){

    }

}
