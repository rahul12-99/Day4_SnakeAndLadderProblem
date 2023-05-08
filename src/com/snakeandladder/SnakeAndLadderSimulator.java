package com.snakeandladder;

public class SnakeAndLadderSimulator {
    /*
     * The main method is for Player then checks for an Option. They are No Play, Ladder or Snake.
     *  - Use ((RANDOM)) to check for Options
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Initialized the playerPosition and random variable for getNumber and get options for play.
         * 2) Taking condition for no play, and ladder or snake
         */
        /*
         * 1) Initialized the playerPosition and random variable for getNumber and get options for play.
         */
        int playerPosition = 0;
        int getNumber = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
        int getOption = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        /*
         2) Taking condition for no play, and ladder or snake
         */
        switch (getOption) {
            case 0:
                playerPosition = playerPosition;
                break;
            case 1:
                playerPosition += getNumber;
                break;
            case 2:
                playerPosition -= getNumber;
                break;
        }
        System.out.println(playerPosition);
    }
}
