public class calculationCost {
    //delcare varibale for weekly fee and defined fee
    private double beginnerWeeklyCost=25.00;
    private double interWeeklyCost=30.00;
    private double eliteWeeklyCost=35.00;
    private double competitionFee=22;
    private double privateCoachingFee=9;

    //Declare variabale for competition  this variable use to store total cost plan fee for a month
    private int week=4;
    //Declare variable total cost of beginner
    private double totalCostOfBeginner;
    private double totalCostOfInter;
    private double totalCostOfElite;

    //Declare variable for competition and private coaching this variable use to store total cost fee for a month
    private double totalCostOfCompetition;
    private double totalCostOfPrivateCoaching;
    private double overAllCost;

    //We just have to declare get method cuz we already defined value
    //Get method for each plan
    public double getBeginnerWeeklyCost() {
        return beginnerWeeklyCost;
    }
    public double getInterWeeklyCost() {
        return interWeeklyCost;
    }
    public double getEliteWeeklyCost() {
        return eliteWeeklyCost;
    }

    //i just create get method cuz i already defined values
    public double getCompetitionFee() {
        return competitionFee;
    }


    ////i just create get method cuz i already defined values


    public double getPrivateCoachingFee() {
        return privateCoachingFee;
    }

    //Declare get method for week
    public int getWeek() {
        return week;
    }

    //Getter and setter method for totalCostOf beginner
    public double getTotalCostOfBeginner() {
        return totalCostOfBeginner;
    }
    public void setTotalCostOfBeginner(double totalCostOfBeginner) {
        this.totalCostOfBeginner = totalCostOfBeginner;
    }

    //Get and set for total cost of inter
    public double getTotalCostOfInter() {
        return totalCostOfInter;
    }
    public void setTotalCostOfInter(double totalCostOfInter) {
        this.totalCostOfInter = totalCostOfInter;
    }

    //Get and set method for total cost of elite
    public double getTotalCostOfElite() {
        return totalCostOfElite;
    }
    public void setTotalCostOfElite(double totalCostOfElite) {
        this.totalCostOfElite = totalCostOfElite;
    }

    //get and set method for overall cost
    public double getOverAllCost() {
        return overAllCost;
    }

    public void setOverAllCost(double overAllCost) {
        this.overAllCost = overAllCost;
    }

    //get and set method for private coaching
    public double getTotalCostOfPrivateCoaching() {
        return totalCostOfPrivateCoaching;
    }
    public void setTotalCostOfPrivateCoaching(double totalCostOfPrivateCoaching) {
        this.totalCostOfPrivateCoaching = totalCostOfPrivateCoaching;
    }

    //get and set method for total cost of competition
    public double getTotalCostOfCompetition() {
        return totalCostOfCompetition;
    }
    public void setTotalCostOfCompetition(double totalCostOfCompetition) {
        this.totalCostOfCompetition = totalCostOfCompetition;
    }
}
