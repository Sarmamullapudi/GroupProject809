package GroupProject809;
/**
 * Created by Sarma on 07-03-2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class VariablesTopic extends AbstractTopic {

    public VariablesTopic(){

        incrementRound();

        this.topic = "Variables Statements";

        this.questionsAndAnswers.add(new QuestionAndAnswer("Question 1\nWhich one of the following is NOT a correct variable name?\n" + "" +
                "(a)2bad\n" +
                "(b)zero\n" +
                "(c)theLastValueButOne\n" +
                "(d)year2000",
                "a"));

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 2\nWhich one of the following declarations is NOT correct?\n" +
                "(a)double duty;\n" +
                "(b)float loan = 84.6;\n" +
                "(c)boolean value = 12;\n" +
                "(d)int start = 34, end = 99;\n",
                "c")) ;

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 3\nThe input/output package usually used with Java is:\n" +
              "(a)java.input\n" +
              "(b)java.io\n" +
              "(c)java.inout\n" +
              "(d)java.file\n",
              "b")) ;

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 4\nWhich one of the following is a reserved word?\n" +
                "(a)apple\n" +
                "(b)7up\n" +
                "(c)grandTotal\n" +
                "(d)boolean",
                "d" ));

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 5\nWhat is the name of a stream that connects two running programs?\n" +
              "(a)Program stream\n" +
              "(b)Conduit\n" +
              "(c)Pipe\n" +
              "(d)Channel",
              "c" ));

    }


}
