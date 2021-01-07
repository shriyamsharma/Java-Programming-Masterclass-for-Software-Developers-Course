package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int score2 = 10000;
        int newlevel = 8;
        int bonus2 = 200;


        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("The Final Score is:: " + finalScore);
            int NewScore = score2 + (newlevel * bonus2);
            System.out.println("New score is " + NewScore);
        }
    }
}






