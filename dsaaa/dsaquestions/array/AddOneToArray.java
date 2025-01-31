import java.util.Arrays;

public class AddOneToArray {

    // Function to add 1 to the number represented by an array
    public static int[] addOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;  // Set current digit to 0 if it's 9
        }
        
        // If all digits were 9, create a new array with an extra digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1
        int[] input1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + Arrays.toString(addOne(input1)));

        // Test Case 2
        int[] input2 = {9, 9};
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + Arrays.toString(addOne(input2)));

        // Test Case 3
        int[] input3 = {0};
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Output: " + Arrays.toString(addOne(input3)));

        // Test Case 4
        int[] input4 = {1, 0, 0, 0};
        System.out.println("Input: " + Arrays.toString(input4));
        System.out.println("Output: " + Arrays.toString(addOne(input4)));
    }
}
