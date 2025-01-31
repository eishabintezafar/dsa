import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyByTwo {

    // Function to multiply the number formed by an array by 2
    public static int[] multiplyByTwo(int[] digits) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;

        // Start from the least significant digit and move left
        for (int i = digits.length - 1; i >= 0; i--) {
            int product = digits[i] * 2 + carry;
            result.add(0, product % 10);  // Add the last digit of the product
            carry = product / 10;         // Carry the remaining part
        }

        if (carry > 0) {
            result.add(0, carry);  // Add remaining carry if any
        }

        // Convert the ArrayList to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1
        int[] input1 = {2, 3, 4};
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + Arrays.toString(multiplyByTwo(input1)));

        // Test Case 2
        int[] input2 = {0};
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + Arrays.toString(multiplyByTwo(input2)));

        // Test Case 3
        int[] input3 = {5, 0, 0};
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Output: " + Arrays.toString(multiplyByTwo(input3)));
    }
}
