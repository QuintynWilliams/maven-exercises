import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check if the input is a number
        boolean isNumber = StringUtils.isNumeric(input);
        System.out.println("Is a number: " + isNumber);

        // Flip the case of the input
        String flippedCase = StringUtils.swapCase(input);
        System.out.println("Flipped case: " + flippedCase);

        // Reverse the input
        String reversed = StringUtils.reverse(input);
        System.out.println("Reversed string: " + reversed);

    }

}
