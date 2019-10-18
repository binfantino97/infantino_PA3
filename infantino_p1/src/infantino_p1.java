
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class infantino_p1 {

    public static void getDifficultyLevel(int[] difficulty)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the difficulty level from 1 to 4");

        difficulty[0] = scnr.nextInt();
        while( !( (difficulty[0]<=4) && (difficulty[0]>=1) ) )
        {
            System.out.println("Please enter the difficulty level from 1 to 4");
            difficulty[0] = scnr.nextInt();
        }
    }

    public static void getProblemType(int[] tempProblemType)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the math game!");
        System.out.println("Enter 1 for addition problems.");
        System.out.println("Enter 2 for multiplication problems.");
        System.out.println("Enter 3 for subtraction problems.");
        System.out.println("Enter 4 for division problems.");
        System.out.println("Enter 5 for a random mixture of arithmetic problems.");
        tempProblemType[0] = scnr.nextInt();
        while( !( (tempProblemType[0]<=5) && (tempProblemType[0]>=1) ) )
        {
            System.out.println("Enter 1 for addition problems.");
            System.out.println("Enter 2 for multiplication problems.");
            System.out.println("Enter 3 for subtraction problems.");
            System.out.println("Enter 4 for division problems.");
            System.out.println("Enter 5 for a random mixture of arithmetic problems.");
            tempProblemType[0] = scnr.nextInt();
        }
    }


    public static void generateQuestion(double[] correctAns, int[] difficulty, int problemType) {

        SecureRandom rand = new SecureRandom();
        double ans= 0;
        double temp;

        if(difficulty[0] == 1)
        {
            /* Generate positive double between 1-9 */
            double rand1 = rand.nextInt(9)+1;
            double rand2 = rand.nextInt(9)+1;

            switch(problemType)
            {
                case 1:
                    System.out.println("What is "+ rand1 +" + " + rand2 +"?");
                    ans = rand1 + rand2;
                    break;

                case 2:
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    ans = rand1 * rand2;
                    break;
                case 3:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    ans = rand1 - rand2;
                    break;
                case 4:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    ans = rand1 / rand2;
                    break;
            }

            correctAns[0]= ans;
        }

        else if(difficulty[0] == 2)
        {
            /* Generate positive double between 1-99 */
            double rand1 = rand.nextInt(99)+1;
            double rand2 = rand.nextInt(99)+1;

            switch(problemType)
            {
                case 1:
                    System.out.println("What is "+ rand1 +" + " + rand2 +"?");
                    ans = rand1 + rand2;
                    break;

                case 2:
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    ans = rand1 * rand2;
                    break;
                case 3:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    ans = rand1 - rand2;
                    break;
                case 4:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    ans = rand1 / rand2;
                    break;
            }

            correctAns[0]= ans;
        }

        else if(difficulty[0] == 3)
        {
            /* Generate positive double between 1-999 */
            double rand1 = rand.nextInt(999)+1;
            double rand2 = rand.nextInt(999)+1;

            switch(problemType)
            {
                case 1:
                    System.out.println("What is "+ rand1 +" + " + rand2 +"?");
                    ans = rand1 + rand2;
                    break;

                case 2:
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    ans = rand1 * rand2;
                    break;
                case 3:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    ans = rand1 - rand2;
                    break;
                case 4:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    ans = rand1 / rand2;
                    break;
            }

            correctAns[0]= ans;
        }

        else if(difficulty[0] == 4)
        {
            /* Generate positive double between 1-999 */
            double rand1 = rand.nextInt(9999)+1;
            double rand2 = rand.nextInt(9999)+1;

            switch(problemType)
            {
                case 1:
                    System.out.println("What is "+ rand1 +" + " + rand2 +"?");
                    ans = rand1 + rand2;
                    break;

                case 2:
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    ans = rand1 * rand2;
                    break;
                case 3:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    ans = rand1 - rand2;
                    break;
                case 4:
                    if(rand2>rand1)
                    {
                        temp = rand1;
                        rand1 = rand2;
                        rand2 = temp;
                    }
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    ans = rand1 / rand2;
                    break;
            }

            correctAns[0]= ans;
        }

    }

    public static void generateCorrectResponse()
    {
        String correct="";
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(4)+1;

        switch(rand1)
        {
            case 1:
                correct = "Very good!";
                break;

            case 2:
                correct =  "Excellent!";
                break;
            case 3:
                correct =  "Nice Work!";
                break;
            case 4:
                correct =  "Keep up the good work!";
                break;
        }
        System.out.println(correct);
    }

    public static void generateIncorrectResponse()
    {
        String incorrect="";
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(4)+1;

        switch(rand1)
        {
            case 1:
                incorrect = "No. Please try again.";
                break;

            case 2:
                incorrect =  "Wrong. Try once more.";
                break;
            case 3:
                incorrect =  "Don't give up!";
                break;
            case 4:
                incorrect =  "No. Keep trying.";
                break;
        }
        System.out.println(incorrect);
    }


    public static void main(String[] args) {
        int levelUp = 0;
        int userContinue = 1;
        int problemType;
        double percentage;
        int correct;
        int incorrect;
        int i;
        int[] difficulty = new int[1];
        int[] tempProblemType = new int[1];
        double[] correctAns = new double[1];
        double studentAns;
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();


        while(userContinue != -1)
        {

            if(levelUp != 1) {
                getDifficultyLevel(difficulty);
                getProblemType(tempProblemType);
            }
            else if(levelUp == 1)
            {
                getProblemType(tempProblemType);
            }

            correct = 0;
            incorrect = 0;
            for(i = 0; i<10;i++)
            {

                if(tempProblemType[0] == 5)
                    problemType = rand.nextInt(4)+1;
                else
                    problemType = tempProblemType[0];

                generateQuestion(correctAns, difficulty, problemType);

                studentAns = scnr.nextDouble();

                if(problemType != 4)
                {
                    if(Math.abs(studentAns - correctAns[0]) < 0.0001)
                    {
                        generateCorrectResponse();
                        correct++;
                    }
                    else
                    {
                        generateIncorrectResponse();
                        incorrect++;
                    }
                }
                else if(problemType == 4)
                {
                    if(Math.abs(studentAns - correctAns[0]) < 0.1)
                    {
                        generateCorrectResponse();
                        correct++;
                    }
                    else
                    {
                        generateIncorrectResponse();
                        incorrect++;
                    }
                }

            }
            percentage = ((double)correct / 10.0)*100;

            System.out.println("You answered " + correct + "  problems correctly.");
            System.out.println("You answered " + incorrect + "  problems incorrectly.");
            System.out.println("You scored "+ percentage +"%");

            System.out.println("");
            System.out.println("");

            if(percentage >= 75)
            {
                System.out.println("Congratulations, you are ready to go to the next level!");

                if(difficulty[0]!=4)
                    System.out.println("Enter 1 to restart this game on the next level of difficulty.");

                System.out.println("Press 0 to choose your difficulty or exit the game.");
                levelUp = scnr.nextInt();

            }
            else
                System.out.println("Please ask your teacher for extra help.");

            if(levelUp != 1)
            {
                System.out.println("Enter -1 to exit the game.");
                System.out.println("Enter 1 to play again.");
                userContinue = scnr.nextInt();
                while(!(userContinue == 1 || userContinue == -1))
                {
                    System.out.println("Enter -1 to exit the game.");
                    System.out.println("Enter 1 to continue");
                    userContinue = scnr.nextInt();
                }
            }
            else if(difficulty[0] < 4 && levelUp == 1)
            {
                userContinue = 1;
                difficulty[0]= difficulty[0] + 1;
            }
            else if(difficulty[0] == 4 && levelUp == 1)
            {
                userContinue = 1;
                levelUp = 0;
            }

            if(userContinue == -1)
            {
                System.exit(0);
            }
        }
    }
}
