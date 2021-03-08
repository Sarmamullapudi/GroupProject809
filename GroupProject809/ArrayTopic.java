package GroupProject809;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Alexander on 16/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ArrayTopic extends AbstractTopic
{
   public ArrayTopic()
   {

      //Start of round, increase round count
      incrementRound();

      this.topic = "5";

      this.questionsAndAnswers.add(new QuestionAndAnswer("Does an array have a fixed size? (y/n)", "y"));
      this.questionsAndAnswers.add(new QuestionAndAnswer("Can arrays contain different data types (y/n)?", "n"));
      this.questionsAndAnswers.add(new QuestionAndAnswer("We have an array: int[] list = {3};\n" +
              "What would be the value of list.length ?", "1"));
      this.questionsAndAnswers.add(new QuestionAndAnswer("We have an array: int[] list = {9,35,15,6};\n" +
              "What would be the output of:\n" +
              "System.out.print(list[2]); ?","15"));
      this.questionsAndAnswers.add(new QuestionAndAnswer("The number used to refer to a particular element of an array is called?","index"));


   }//default constructor
}//class