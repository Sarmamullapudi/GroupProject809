package GroupProject809;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by Group10 Team on 16/02/2021
 *
 */
public class UserInterface {

   static public Scanner scanner;
   static public int userSelection;
   public String[] topics = {"1 - Variables / Data Input / Selection", "2 - Control - Methods", "3 - Classes", "4 - Arrays","5 - Exit Test"};

   public UserInterface(Scanner scanner) {
      this.scanner = scanner;
      }//Alternative constructor

   public void welcome() {
//User Info and welcome to App
      System.out.println();
      System.out.println("Welcome to the Java Revision Quiz!");
      System.out.println("Enter your name to to continue: ");
      String name = scanner.nextLine();
      System.out.println("Welcome " + name.toUpperCase() + " let's begin!");
   }


   public void start(){
      System.out.println("Which of the following topics would you like to test yourself on?");

//Topic Array List
      for (String topic : topics) {
      System.out.println(topic + " ");
      }

//Do While Loop for user selection - to ensure they select 1 -5
      do {
         System.out.println("Please enter your selection: 1, 2, 3, 4 or 5:");
         userSelection = scanner.nextInt();
      } while (userSelection >= 6);

//Switch statement to select revision topic
      switch (userSelection) {
            case 1:
               //System.out.println("Run Variables etc Class - Sarma");
               VariablesTopic variablesTopic = new VariablesTopic();
               variablesTopic.askQs();
               variablesTopic.printScore();
               variablesTopic.reviewTest();
               break;
            case 2:
               ControlStatementTopic controlRound = new ControlStatementTopic();
               controlRound.askQs();
               controlRound.printScore();
               controlRound.reviewTest();
               break;
            case 3:
               ClassesTopic classesRound = new ClassesTopic();
               classesRound.askQs();
               classesRound.printScore();
               classesRound.reviewTest();
               break;
            case 4:
               ArrayTopic arrayRound = new ArrayTopic();
               arrayRound.askQs();
               arrayRound.printScore();
               arrayRound.reviewTest();
               break;
            case 5:
                System.out.println("Good Bye!!!");
                System.exit(0);
                break;

            default:
               System.out.println("Invalid Choice. Please try again");
               break;
         }//switch
   }//start

   public void continueTest()
      //Select whether they wish to continue
   {
      System.out.println("Would you like try another test section. Enter Y or N");
      String endTest = scanner.next();
      if (endTest.equalsIgnoreCase("N")) {
         System.out.println("We hope you enjoyed using the test! Good Bye!!!");
      }
      else if (endTest.equalsIgnoreCase("Y")){
         System.out.println("Great lets keep going, please select a topic.");
         start();
         continueTest();
      }
      else{
         System.out.println("Invalid Option Entered..!!!");
         continueTest();
      }
   }
}//class