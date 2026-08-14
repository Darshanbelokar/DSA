package Binary_search;

public class GuessNumberHigherLower {

    // The actual picked number
    static int pickedNumber = 6;

    // Guess API
    public static int guess(int num) {

        if (num > pickedNumber) {
            return -1;
        }
        else if (num < pickedNumber) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int guessNumber(int n) {

        int low = 1;
        int high = n;

        while (low <= high) {

            int pick = low + (high - low) / 2;

            int result = guess(pick);

            if (result == -1) {
                // pick is too high
                high = pick - 1;
            }
            else if (result == 1) {
                // pick is too low
                low = pick + 1;
            }
            else {
                // Correct number found
                return pick;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 10;

        int answer = guessNumber(n);

        System.out.println("Picked number: " + pickedNumber);
        System.out.println("Found number: " + answer);
    }
}