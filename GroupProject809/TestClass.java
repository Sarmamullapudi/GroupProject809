package GroupProject809;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by Group 10 Team on 16/02/2021
 *
 */
public class TestClass
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      GroupProject809.UserInterface userInterface = new GroupProject809.UserInterface(scanner);

      //Created a welcome method, this avoids the user getting asked for their name again if they choose a to keep going.
      userInterface.welcome();

      long startTime = System.currentTimeMillis();
      userInterface.start();
      //Created a continueTest method to loop the user around the more tests or leave the revision app.
      userInterface.continueTest();
      long endTime = System.currentTimeMillis();

      // calculate time difference
      long timeDiff = endTime - startTime;
      System.out.println("Test time is " + timeDiff/1000.0 + " seconds ");

   }//main
}//class