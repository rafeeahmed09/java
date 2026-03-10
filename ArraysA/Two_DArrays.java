package ArraysA;

public class Two_DArrays {

    public static void main(String[] args) {

        int[][] marks = new int[3][3];
        marks[0][0] = 23;
        marks[0][1] = 34;
        marks[0][2] = 40;

        marks[1][0] = 23;
        marks[1][1] = 34;
        marks[1][2] = 40;

        marks[2][0] = 23;
        marks[2][1] = 34;
        marks[2][2] = 40;

        // Print marks matrix
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] roll = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Print roll matrix
        for (int row = 0; row < roll.length; row++) {
            for (int col = 0; col < roll[row].length; col++) {
                System.out.print(roll[row][col] + " ");
            }
            System.out.println();
        }
    }
}