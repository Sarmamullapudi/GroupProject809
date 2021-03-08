package GroupProject809;

/**
 * Created by enya_ on 02/03/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class ControlStatementTopic extends AbstractTopic {

    public ControlStatementTopic()
    {
        //Start of round, increase round count
        incrementRound();

        this.topic = "Control Statements";

        this.questionsAndAnswers.add(new QuestionAndAnswer("Question 1\nWhat is true about a break?\n" + "" +
                "(a)Break stops the execution of entire program\n" +
                "(b)Break halts the execution and forces the control out of the loop\n" +
                "(c)Break forces the control out of the loop and starts the execution of next iteration\n" +
                "(d)Break halts the execution of the loop for certain time frame",
                "b"));

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 2\nWhich of the following is not a decision making statement?\n" +
                "(a)if\n" +
                "(b)if-else\n" +
                "(c)switch\n" +
                "(d)do-while",
                "d")) ;

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 3\nThe most basic control flow statement supported by the Java programming language is the _____ statement.", "if-then")) ;

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 4\nWhich of the following is a loop construct that will always be executed once?\n" +
                "(a)switch\n" +
                "(b)for\n" +
                "(c)while\n" +
                "(d)do...while",
                "d" ));

        this.questionsAndAnswers.add(new QuestionAndAnswer("\nQuestion 5\nStatements that execute a block of code repeatedly until a specified condition is met are known as _____ _____.",
                "looping statements"));



    }



}


