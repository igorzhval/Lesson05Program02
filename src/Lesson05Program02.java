public class Lesson05Program02 {
    public static void main(String[] args) {
        printUnluckyNumbers();
    }
    public static void printUnluckyNumbers() {
        int count = 0;
        for (int i = 1; count < 100; i++) {
            if (isUnluckyNumber(i)) {
                System.out.println("Shuttle " + (count + 1) + ": " + i);
                count++;
            }
        }
    }
    public static boolean isUnluckyNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}