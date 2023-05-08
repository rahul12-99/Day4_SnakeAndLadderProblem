package com.snakeandladder;

public class SnakeAndLadderSimulator {
    /*
     * The main method is for Player repeat till player position reach the 100
     *  - Use ((RANDOM)) to check for Options
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Initialized the playerPosition and random variable for getNumber and get options for play.
         * 1.1) Taking a condition in while loop until 100
         * 2) Taking condition for no play, and ladder or snake
         * 3) Taking condition if player position less than 0
         */
        /*
         * 1) Initialized the playerPosition and random variable for getNumber and get options for play.
         */
        int playerPosition = 0;
        /*
         1.1) Taking a condition in while loop until 100
         */
        while (playerPosition < 100) {
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
            /*
             3) Taking condition if player position less than 0
             */
            if(playerPosition < 0){
                playerPosition = 0;
            }
        }
        System.out.println(playerPosition);
    }
}
