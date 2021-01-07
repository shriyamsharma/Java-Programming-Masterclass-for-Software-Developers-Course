package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore =  calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore =  calculateScore(false, 1000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("shri", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition("nit", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition("ajay", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition("tiny", highScorePosition);

            highScorePosition = calculateHighScorePosition(1000);
            displayHighScorePosition("kartik", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        if(score >=1000) {
            position = 1;
        } else if (score >= 1000){
            position = 2;
        } else if (score >=100); {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}
