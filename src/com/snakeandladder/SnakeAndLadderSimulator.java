package com.snakeandladder;

public class SnakeAndLadderSimulator {
    /*
     * The main method is for count how much times dice rolled
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Initialized the playerPosition , dice roll count and random variable
         * for getNumber and get options for play.
         * 1.1) Taking a condition in while loop until 100 and increase the dice count
         * 2) Taking condition for no play, and ladder or snake
         * 3) Taking condition if player position less than 0 or greater than 100
         * 4) Printing the player position with dice roll count and player final position
         */
        /*
         * 1) Initialized the playerPosition , dice roll count and random variable
         * for getNumber and get options for play.
         */
        int playerPosition = 0;
        int diceRollCount = 0;
        /*
         1.1) Taking a condition in while loop until 100 and increase the dice count
         */
        while (playerPosition < 100) {
            diceRollCount++;
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
             3) Taking condition if player position less than 0 or greater than 100
             */
            if (playerPosition < 0) {
                playerPosition = 0;
            }
            if (playerPosition > 100){
                playerPosition -= getNumber;
            }
            /*
             4) Printing the player position with dice roll count and player final position
             */
            System.out.println("player position after: " + diceRollCount + " is " + playerPosition);
        }
        System.out.println("Final position " +playerPosition);
    }
}
