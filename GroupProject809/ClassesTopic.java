package GroupProject809;

/**
 *Created by Richard on 03/03/2021
 *Classes & Objects Topic question & answer
 **/
public class ClassesTopic extends AbstractTopic
{
   public ClassesTopic()
   {
      //Start of round, increase round count
      incrementRound();

      this.topic = "Classes & Objects";
      //Q1
      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "What are the typical one of the key elements of a class" + "\nA - Instance Variables, \nB - Instance Classes, \nC - Instance Objects, \nD - Instance index",
            "a"));
      //Q2
      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "An object is known as a member of a Class but often what other term is used?",
            "instance"));
      //Q3
      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "A static Modifier associates a variable or method with its _____? (Fill in the blank)",
            "class"));
      //Q4
      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "Java allows us to ______ attributes and methods from one another ? (Fill in the blank)",
            "inherit"));
      //Q5
      this.questionsAndAnswers.add(new QuestionAndAnswer(
            "myCar = ___ Car(); The operator is missing, can you complete it? (Fill in the blank)",
            "new"));
   }//main
}//class
