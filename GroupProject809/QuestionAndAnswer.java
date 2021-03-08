package GroupProject809;

public class QuestionAndAnswer
{
   protected String question;
   protected String answer;

   public QuestionAndAnswer() {
   }//default constructor

   public QuestionAndAnswer(String question, String answer) {
      this.question = question;
      this.answer = answer;
   }//Alternative constructor

   public void askQ() {
      System.out.println(question);
   }//askQ

   public boolean isCorrect(String userAnswer) {
      return userAnswer.toLowerCase().equals(answer);
   }//isCorrect

   public void correctAnswer() {
      System.out.println("The correct answer is :" + answer + "\n");
   }//askQ



}//class