import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //for user answer yes or no
        String addAthlete;
        boolean validInput=false;
        boolean validInput1=false;
        boolean validInput2=false;
        boolean validInput3=false;
        // create object for all method
        Athlete ath=new Athlete();
        //call display message method for display message
        ath.displayWelMessage();
        Scanner sc = new Scanner(System.in);


        do {
            //Request athlete's name
            do {
                System.out.print("Enter Athlete Name (letter only)        :");
                ath.setAthleteName(sc.next());
                if(!ath.getAthleteName().matches("[a-zA-Z]+")) {
                    System.out.println("Validate Input, Put string only.");
                }
                else {
                    break;
                }
            }while(!ath.getAthleteName().matches("[a-zA-Z]+"));//! symbol is athlethe name = a to z =True but this symbol wil !true not true

            //Request athlete current weight
            do {
                System.out.print("Enter current weight      (kg): ");
                if (sc.hasNextInt()) {
                    ath.setCurrentWeight(sc.nextInt());
                    if (ath.getCurrentWeight() < 55) {
                        System.out.println("Validate Input, weight must be above 55.");
                    } else {
                        validInput = true; // Valid input
                    }
                } else {
                    System.out.println("Validate Input! Please enter a valid number (not a letter).");
                    sc.next(); // Clear the invalid input
                }
            } while (!validInput );

            //call method of displayWeightCategory
            ath.displayWeightCategory();

            //using do while statement for we want user input between 1 and 6
            do {
                System.out.print("Enter competition weight  (1_6): ");
                if (sc.hasNextInt()) {
                    ath.setCompetitionWeight(sc.nextInt());
                    if (ath.getCompetitionWeight() > 6 || ath.getCompetitionWeight() < 1) {
                        System.out.println("Validate Input! Please enter a number between 0 and 6.");
                    } else {
                        validInput2 = true; // Valid input
                    }
                } else {
                    System.out.println("Validate Input! Please enter a valid number (not a letter).");
                    sc.next(); // Clear the invalid input
                }
            } while (!validInput2);

            //call method for display training plan
            ath.displayTrainingPlan();

            //using do while statement for we want user input between 1 and 3
            do {
                System.out.print("Enter training plan (1-3): ");
                if (sc.hasNextInt()) {
                    ath.setTrainingPlan(sc.nextInt());
                    if (ath.getTrainingPlan() < 1 || ath.getTrainingPlan() > 3) {
                        System.out.println("Validate Input! Please enter a number between 1 and 3.");
                    } else {
                        validInput3 = true; // Valid input
                    }
                } else {
                    System.out.println("Validate Input! Please enter a valid number (not a letter).");
                    sc.next(); // Clear the invalid input
                }
            } while (!validInput3);

            //Ask user about competition using with if else statement
            if (ath.getTrainingPlan() == 2 || ath.getTrainingPlan() == 3) {
                do {
                    System.out.println("Do you want to compete in this month? (Y/N)");
                    ath.setCompetition(sc.next());
                    if (!ath.getCompetition().equals("Y") && !ath.getCompetition().equals("N")) {
                        System.out.println("Validate Input!");
                    } else {
                    }
                }while(!ath.getCompetition().equals("Y") && !ath.getCompetition().equals("N"));
                do {
                    System.out.print(" Enter private coaching hours in a month (max20)   :");
                    if(sc.hasNextInt()) {
                        ath.setPrivateCoaching(sc.nextInt());
                        if (ath.getPrivateCoaching() > 20 || ath.getPrivateCoaching() < 0) {
                            System.out.println("Validate Input! Please enter a number between 0 and 20.");
                        } else {
                            validInput1 = true;
                        }
                    }else {
                        System.out.println("Validate Input! Please enter a valid number (not a letter).");
                        sc.next();
                    }
                } while (!validInput1 ||ath.getPrivateCoaching() > 20|| ath.getPrivateCoaching() < 0);
            }else {
                //Get private coaching hours
                do {
                    System.out.print(" Enter private coaching hours in a month (max20)   :");
                    if (sc.hasNextInt()) {
                        ath.setPrivateCoaching(sc.nextInt());
                        if (ath.getPrivateCoaching() > 20 || ath.getPrivateCoaching() < 0) {
                            System.out.println("Validate Input! Please enter a number between 0 and 20.");
                        } else {
                            validInput1 = true;
                        }
                    } else {
                        System.out.println("Validate Input! Please enter a valid number (not a letter).");
                        sc.next();
                    }
                } while (!validInput1);

            }
            //display athlete'name
            System.out.println("Athlete's Name          :" + ath.getAthleteName());

            //Create obj for call get set method
            calculationCost cal = new calculationCost();

            //display Total cost of training plan for a month
            if (ath.getTrainingPlan() == 1) {
                cal.setTotalCostOfBeginner(cal.getBeginnerWeeklyCost() * cal.getWeek());
                System.out.println("Training plan (Beginner)       25.00*4          :" + cal.getTotalCostOfBeginner());
            } else if (ath.getTrainingPlan() == 2) {
                cal.setTotalCostOfInter(cal.getInterWeeklyCost() * cal.getWeek());
                System.out.println("Training plan (Intermediate)    30.00*4         :" + cal.getTotalCostOfInter());

                //nested loo
                //Display total cost of competition
                if (ath.getCompetition().equals("Y")) {
                    cal.setTotalCostOfCompetition(cal.getCompetitionFee());
                    System.out.println("Competition Fee         22.00              : " + cal.getTotalCostOfCompetition());
                } else {

                }
            } else if (ath.getTrainingPlan() == 3) {
                cal.setTotalCostOfElite(cal.getEliteWeeklyCost() * cal.getWeek());
                System.out.println("Training plan (Elite)           35.00*4     :" + cal.getTotalCostOfElite());


                //Display total cost of competition

                if (ath.getCompetition().equals("Y")) {
                    cal.setTotalCostOfCompetition(cal.getCompetitionFee());
                    System.out.println("Competition Fee             22.00            : " + cal.getTotalCostOfCompetition());
                } else {

                }

            }


            //Display total cost of private coaching for a month
            cal.setTotalCostOfPrivateCoaching(cal.getPrivateCoachingFee() * ath.getPrivateCoaching());
            System.out.println("Private Coaching Fee                        : " + cal.getTotalCostOfPrivateCoaching());


            //Display overall total cost
            if (ath.getTrainingPlan() == 1) {
                cal.setOverAllCost(cal.getTotalCostOfBeginner() + cal.getTotalCostOfPrivateCoaching());
                System.out.println("Over All cost                       :" + cal.getOverAllCost());
            } else if (ath.getTrainingPlan() == 2) {
                cal.setOverAllCost(cal.getTotalCostOfInter() + cal.getTotalCostOfCompetition() + cal.getTotalCostOfPrivateCoaching());
                System.out.println("Over All Cost                       :" + cal.getOverAllCost());
            } else if (ath.getTrainingPlan() == 3) {
                cal.setOverAllCost(cal.getTotalCostOfElite() + cal.getTotalCostOfCompetition() + cal.getTotalCostOfPrivateCoaching());
                System.out.println("Over All Cost                       :" + cal.getOverAllCost());
            }

            if (ath.getCompetitionWeight() == 1) {
                System.out.println("Current weight : "+ ath.getCurrentWeight() +" | " +"Target competition weight :"+ath.getCompetitionWeight()+"(Heavy Weight  Over 100)");
            } else if (ath.getCompetitionWeight() == 2) {
                System.out.println("Current weight : "+ ath.getCurrentWeight() +" | " +"Target competition weight :"+ath.getCompetitionWeight()+"(light-Heavy Weight  100)");
            } else if (ath.getCompetitionWeight() == 3) {
                System.out.println("Current weight : "+ ath.getCurrentWeight() +" | " +"Target competition weight :"+ath.getCompetitionWeight()+"(Middle Weight  90)");
            } else if (ath.getCompetitionWeight() == 4) {
                System.out.println("Current weight : "+ ath.getCurrentWeight() +" | " +"Target competition weight :"+ath.getCompetitionWeight()+"(Light Middle Weight  81)");
            } else if (ath.getCompetitionWeight() == 5) {
                System.out.println("Current weight : "+ ath.getCurrentWeight() +" | " +"Target competition weight :"+ath.getCompetitionWeight()+"(Light weight 73)");
            } else{
                System.out.println("Current weight : "+ ath.getCurrentWeight() +" | " +"Target competition weight :"+ath.getCompetitionWeight()+"(Fly Weight 66)");
            }

            do {
                System.out.println("Do you want to add another athlete? (Y/N)");
                addAthlete = sc.next();

                if (!addAthlete.equals("Y") && !addAthlete.equals("N")) {
                    System.out.println("Invalid input, please enter Y or N.");
                } else {
                    break; // Input is valid; exit the loop
                }
            } while (!addAthlete.equals("Y") || !addAthlete.equals("N")); // Keep looping until valid input is received

        }while(addAthlete.equals("Y"));
        ath.thankYouMessage();
    }
}