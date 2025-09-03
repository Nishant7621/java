// User function Template for Java

class Solution {
    public int[] endPoints(int[][] matrix, int m, int n) {
        // Direction vectors: right, down, left, up
        int[][] directions = {
            {0, 1},   // right
            {1, 0},   // down
            {0, -1},  // left
            {-1, 0}   // up
        };

        int dirIdx = 0; // Start moving to the right
        int i = 0, j = 0; // Start position

        while (i >= 0 && i < m && j >= 0 && j < n) {
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;
                dirIdx = (dirIdx + 1) % 4; // Turn right
            }

            // Move in the current direction
            i += directions[dirIdx][0];
            j += directions[dirIdx][1];
        }

        // Last valid position before going out of bounds
        i -= directions[dirIdx][0];
        j -= directions[dirIdx][1];

        return new int[]{i, j};
    }
}
