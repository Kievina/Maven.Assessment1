package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int minNumberOfJumps;
        int numJumpHeightJumps;
        if (jumpHeight > flagHeight) {
            minNumberOfJumps = flagHeight;
        } else if (jumpHeight == flagHeight) {
            minNumberOfJumps = 1;
        } else {
            numJumpHeightJumps = (int) (flagHeight / jumpHeight);
            minNumberOfJumps = numJumpHeightJumps + (flagHeight - (jumpHeight * numJumpHeightJumps));
        }
        return minNumberOfJumps;
    }
}
