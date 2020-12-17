package Model;

public class HockeyPlayer {
    private String name;
    private String sex;
    private int yearOfBirth;
    private int hight;
    private int weight;
    private String trainingExperience;
    private String bodyType;
    private String pressure;
    private int numberWorkoutsWithoutBreaks;
    private int maxNumberWorkoutsWithoutBreaks;
    private int desiredNumberWorkoutsInWeek;

    public HockeyPlayer(String name, String sex, int yearOfBirth, int hight, int weight, String trainingExperience, String bodyType, String pressure, int numberWorkoutsWithoutBreaks, int maxNumberWorkoutsWithoutBreaks, int desiredNumberWorkoutsInWeek) {
        this.name = name;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.hight = hight;
        this.weight = weight;
        this.trainingExperience = trainingExperience;
        this.bodyType = bodyType;
        this.pressure = pressure;
        this.numberWorkoutsWithoutBreaks = numberWorkoutsWithoutBreaks;
        this.maxNumberWorkoutsWithoutBreaks = maxNumberWorkoutsWithoutBreaks;
        this.desiredNumberWorkoutsInWeek = desiredNumberWorkoutsInWeek;
    }

    public HockeyPlayer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTrainingExperience() {
        return trainingExperience;
    }

    public void setTrainingExperience(String trainingExperience) {
        this.trainingExperience = trainingExperience;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getNumberWorkoutsWithoutBreaks() {
        return numberWorkoutsWithoutBreaks;
    }

    public void setNumberWorkoutsWithoutBreaks(int numberWorkoutsWithoutBreaks) {
        this.numberWorkoutsWithoutBreaks = numberWorkoutsWithoutBreaks;
    }

    public int getMaxNumberWorkoutsWithoutBreaks() {
        return maxNumberWorkoutsWithoutBreaks;
    }

    public void setMaxNumberWorkoutsWithoutBreaks(int maxNumberWorkoutsWithoutBreaks) {
        this.maxNumberWorkoutsWithoutBreaks = maxNumberWorkoutsWithoutBreaks;
    }

    public int getDesiredNumberWorkoutsInWeek() {
        return desiredNumberWorkoutsInWeek;
    }

    public void setDesiredNumberWorkoutsInWeek(int desiredNumberWorkoutsInWeek) {
        this.desiredNumberWorkoutsInWeek = desiredNumberWorkoutsInWeek;
    }
}
