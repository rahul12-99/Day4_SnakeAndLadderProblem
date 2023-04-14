package com.snakeandladder;

public class SnakeAndLadderSimulator {
    /*
     * Created method for player role the dice and get number between 1 and 6 ;
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) initialization the player position and a random variable to get number 1 to 6;
         */

        int playerPosition = 0;
        int playerGetNumber = (int) Math.floor(Math.random()*(6 -1 +1) + 1);
        System.out.println("Player position is : " + playerPosition );
        System.out.println("Player rolls the die and get " + playerGetNumber);
    }
}
