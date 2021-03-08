package GroupProject809;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Group 10 Team on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
abstract class AbstractTopic
{
   public Scanner scanner;
   protected String topic;
   public static int round = 0;
   public int topicScore, userSelection;
   //a list to store all the questions and answers for this round
   public ArrayList<QuestionAndAnswer> questionsAndAnswers;
   public ArrayList<ReviewQandA> reviewQandA;


   public AbstractTopic(){
      this.questionsAndAnswers = new ArrayList<>();
      this.topicScore = 0;
      this.scanner = new Scanner(System.in);
      this.reviewQandA = new ArrayList<>();
   }//default constructor

   public void askQs (){
      System.out.println("\nHere are the questions on " + topic + ":\n");

      // loop through each question in the list for that topic
      for (QuestionAndAnswer q : questionsAndAnswers) {
         q.askQ();
         String userInput = scanner.nextLine();

         ReviewQandA reviewQuestion = new ReviewQandA();
         reviewQuestion.setQuestion(q.question);
         reviewQuestion.setAnswer(q.answer);
         reviewQuestion.setUserAnswer(userInput);
         reviewQandA.add(reviewQuestion);


         if (q.isCorrect(userInput)){
            System.out.println("This is correct! \n");
            topicScore++;
         }//if
         else q.correctAnswer();
      }//for
   }//askQs

   //Increment the round number at the end of every category
   public static void incrementRound() {

      round++;
   }


   public void printScore() {
      System.out.println("You scored " + topicScore + " on the " + topic + " questions");
      System.out.println("No. of rounds attempted: "+round);
   }//printScore


   public void reviewTest(){

      System.out.println("Your test Review is below");

      for(ReviewQandA qandA : reviewQandA) {

         System.out.println(qandA.question);
         System.out.println("Your Answer is: "+qandA.userAnswer);
         System.out.println("Actual Answer is: "+qandA.answer);

      }
   }//reviewTest

}//class