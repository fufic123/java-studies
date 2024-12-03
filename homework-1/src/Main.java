import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1. Input: 7 2 3 -> Output: 723
        String result = "";
        for (short i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            result += num;
        }
        System.out.println("Result: " + result + "\n");


        // Task 2. Input: number and percentage -> Output: number * percentage/100
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter percentage: ");
        int percentage = scanner.nextInt();
        System.out.println("Result: " + (number * percentage / 100.0) + "\n");


        // Task 3. Input: 723895 -> Output: 593827
        System.out.print("Enter a six-digit number: ");
        String input = scanner.next();
        if (input.length() != 6) {
            System.out.println("Error: The number is not six digits.");
        } else {
            char[] chars = input.toCharArray();
            char temp = chars[0];
            chars[0] = chars[5];
            chars[5] = temp;
            temp = chars[1];
            chars[1] = chars[4];
            chars[4] = temp;
            System.out.println("Result: " + new String(chars));
        }


        // Task 4. Input: 3 -> Output: Spring
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Error: Invalid month number.");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Season: Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Season: Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Season: Summer");
        } else {
            System.out.println("Season: Autumn");
        }


        // Task 5. Input: {2, 8, -5, 1, 7, -3, 6} -> Output: {2, 8, -10, 2, 14, -3, 6}
        int[] array = {2, 8, -5, 1, 7, -3, 6}; // Example array
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) minIndex = i;
            if (array[i] > array[maxIndex]) maxIndex = i;
        }
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            array[i] *= 2;
        }
        System.out.print("Modified array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Task 6. Input: 20 11 -> Output: 11 13 15 17 19
        System.out.print("Enter first number: ");
        int start = scanner.nextInt();
        System.out.print("Enter second number: ");
        int end = scanner.nextInt();
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        System.out.print("Odd numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();


        // Task 7. Input: {-3, 0, 5, -7, 0, 8, -1} -> Output: Neg: 3 Pos: 2 Zeros: 2
        int[] randomArray = {-3, 0, 5, -7, 0, 8, -1}; // Example array
        int negativeCount = 0, positiveCount = 0, zeroCount = 0;
        for (int num : randomArray) {
            if (num < 0) negativeCount++;
            else if (num > 0) positiveCount++;
            else zeroCount++;
        }
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Zeros: " + zeroCount);


        // Task 8. Input: People 2 -> Choices: 1, 2 -> Total: 18
        System.out.print("Enter number of people in the group: ");
        int peopleCount = scanner.nextInt();
        double totalCost = 0.0;
        for (int i = 1; i <= peopleCount; i++) {
            System.out.println("Menu for person " + i + ":");
            System.out.println("1. Coffee - $5\n2. Cake - $4\n3. Tea - $3\nEnter 0 to finish.");
            double personCost = 0.0;
            while (true) {
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                if (choice == 0) break;
                switch (choice) {
                    case 1 -> personCost += 5;
                    case 2 -> personCost += 4;
                    case 3 -> personCost += 3;
                    default -> System.out.println("Invalid choice.");
                }
            }
            totalCost += personCost;
        }
        System.out.println("Total cost: $" + totalCost);


        // Task 9. Input: Rows 2 -> Elements 2,3 -> Output: Ratios: 0.5,0.33
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter elements range (e.g., -10 10): ");
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();
        int[][] matrix = new int[rows][];
        double[] ratios = new double[rows];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements for row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            matrix[i] = new int[cols];
            int zeros = 0, nonZeros = 0;
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rangeStart + (int) (Math.random() * (rangeEnd - rangeStart + 1));
                if (matrix[i][j] == 0) zeros++;
                else nonZeros++;
            }
            ratios[i] = nonZeros == 0 ? 0 : (double) zeros / nonZeros;
        }
        System.out.print("Ratios array: ");
        for (double ratio : ratios) {
            System.out.print(ratio + " ");
        }
        System.out.println();


        // Task 10. Input: {-4, 7, 0, -3} -> Output: Even: {0,-4}, Odd: {7,-3}
        int[] singleArray = {-4, -7, 8, 5, -2, 0, 10, 3};
        int evenCount = 0, oddCount = 0, negativeCount2 = 0, positiveCount2 = 0;
        for (int num : singleArray) {
            if (num % 2 == 0 && num != 0) evenCount++;
            if (num % 2 != 0) oddCount++;
            if (num < 0) negativeCount2++;
            if (num > 0) positiveCount2++;
        }
        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];
        int[] negatives = new int[negativeCount2];
        int[] positives = new int[positiveCount2];
        int ei = 0, oi = 0, ni = 0, pi = 0;
        for (int num : singleArray) {
            if (num % 2 == 0 && num != 0) evens[ei++] = num;
            if (num % 2 != 0) odds[oi++] = num;
            if (num < 0) negatives[ni++] = num;
            if (num > 0) positives[pi++] = num;
        }
        System.out.println("Even numbers: " + java.util.Arrays.toString(evens));
        System.out.println("Odd numbers: " + java.util.Arrays.toString(odds));
        System.out.println("Negative numbers: " + java.util.Arrays.toString(negatives));
        System.out.println("Positive numbers: " + java.util.Arrays.toString(positives));
    }
}
