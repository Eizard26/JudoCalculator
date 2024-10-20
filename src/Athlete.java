public class Athlete {

    //declare varibale
    private String athleteName;
    private int currentWeight;
    private int competitionWeight;
    private int trainingPlan;
    private String competition;
    private int privateCoaching;

    //no return method for displayWelMessage
    public void displayWelMessage() {
        System.out.println(".........Welcome from North Sussex Judo.......");
    }

    //getter method for name
    public String getAthleteName() {
        return athleteName;
    }

    //getter method for current weight
    public int getCurrentWeight() {
        return currentWeight;
    }

    //getter method for competitionWeight
    public int getCompetitionWeight() {
        return competitionWeight;
    }

    //getter method for training Plan
    public int getTrainingPlan() {
        return trainingPlan;
    }

    //getter method for competition


    public String getCompetition() {
        return competition;
    }

    //getter method for private coaching
    public int getPrivateCoaching() {
        return privateCoaching;
    }

    //setter method for name
    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    //setter method for current weight
    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    //setter method for competition weight
    public void setCompetitionWeight(int competitionWeight) {
        this.competitionWeight = competitionWeight;
    }

    //setter method for training plan
    public void setTrainingPlan(int trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    //setter method for competition
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    //setter method for private coaching
    public void setPrivateCoaching(int privateCoaching) {
        this.privateCoaching = privateCoaching;
    }

    //create method for displayWeightCategory
    public void displayWeightCategory(){
        System.out.println("______________________________________________________________");
        System.out.println("|  1. Heavyweight             |       Unlimited(over 100)     |");
        System.out.println("|  2. Light-Heavyweight       |       100                     |");
        System.out.println("|  3. Middleweight            |       90                      |");
        System.out.println("|  4. Light-Middleweight      |       81                      |");
        System.out.println("|  5. Lightweight             |       73                      |");
        System.out.println("|  6. Flyweight               |       66                      |");
        System.out.println("|_____________________________________________________________|");
    }

    //create method for display training plan list
    public void displayTrainingPlan() {
        System.out.println("__________________________________________________________________");
        System.out.println("|   1.Beginner (2 sessions per week) – weekly fee     |   $25.00  |");
        System.out.println("|   2.Intermediate (3 sessions per week) – weekly fee |   $30.00  |");
        System.out.println("|   3.Elite (5 sessions per week) – weekly fee        |   $35.00  |");
        System.out.println("__________________________________________________________________");


    }

    //create method for display Thank you message
    public void thankYouMessage(){
        System.out.println("....................THANK YOU FOR JOINING US........................");
    }

}
