package src.app;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation() {
            @Override
            public int action(int a, int b) {
                return a + b;
            }
        };

        String string = "This Sentence is Designed to count the number of uppercase letters in a string.";
        int uppercaseLettersCount = StringListProcessor.countUppercase(string);
        StringManipulator StringUpperCase = (str) -> str.toUpperCase();

        System.out.println("The number of uppercase letters in a string \"" + string + "\" is : " + uppercaseLettersCount + ".");
        System.out.println("All letters in a string are uppercase: " + StringUpperCase.manipulator(string));

        System.out.println("The result of adding two numbers is " + addition.action(2, 3) + ".");

        Supplier<Integer> RandomNumberGenerator = () -> (int) (Math.random() * 100);
        System.out.println("Random number from 1 to 100 is " + RandomNumberGenerator.get()+ ".");

    }
}
