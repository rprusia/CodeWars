/**
 * Emma is playing a new mobile game that starts with consecutively numbered clouds.
 * Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus
 * cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads.
 * Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
 *
 * For each game, Emma will get an array of clouds numbered  if they are safe or
 * if they must be avoided. For example,  indexed from . The number on each cloud is
 * its index in the list so she must avoid the clouds at indexes  and .
 * She could follow the following two paths:  or . The first path takes  jumps while the second takes .
 *
 * Function Description
 *
 * Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
 *
 * jumpingOnClouds has the following parameter(s):
 *
 * c: an array of binary integers
 */
public class JumpingClouds {

    static int jumpingOnClouds(int[] c) {

        int numJumps = 0;
        int i = 0;

        while (i < c.length - 1) {

            if ( i + 2 == c.length || c[i+2] == 1) {
                i++;
                numJumps++;
            } else {
                i += 2;
                numJumps++;

            }
        }
        return numJumps;
    }

    public static void main(String[] args){

        int[] values = {0,0,1,0,0,1,0};

        jumpingOnClouds(values);

    }
}
