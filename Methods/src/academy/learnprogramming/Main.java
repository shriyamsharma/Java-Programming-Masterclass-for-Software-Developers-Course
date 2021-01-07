package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

       int highScore =  calculateScore(true, 800, 5, 100);
       System.out.println("Your final score was " + highScore);

//        calculateScore(true, 10000, 8, 200);
        highScore =  calculateScore(false, 1000, 8, 200);
        System.out.println("Your final score was " + highScore);

    }

//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
            return -1;
    }



}
