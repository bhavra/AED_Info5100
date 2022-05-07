package com.company;

public class Main {

    public static void main(String[] args) {
        int position = calculateHighScore(1500);
        displayHighScorePosition("A", position);
        displayHighScorePosition("B");


        myClass myc1 = new myClass();
        myc1.firstExample();

        mySecClass mys2 = new mySecClass();
        mys2.firstExample();


    }




    public static void displayHighScorePosition(String playername){
        System.out.println(playername + "  managed to get into position on the high score table");
    }

    public static void displayHighScorePosition(String playername, int position){
        System.out.println(playername + "  managed to get into position " +position+ " on the high score table");
    }

    public static int calculateHighScore(int score){
        if (score > 1000){
            return 1;
        }
        else if(score > 500 && score <1000){
            return 2;
        }
        else if(score > 100 && score < 500){
            return 3;
        }
        else
            return 4;
    }
}
