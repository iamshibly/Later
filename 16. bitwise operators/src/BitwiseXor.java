import java.util.Scanner;
public class BitwiseXor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Showing Bitwise Xor operator");
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter the other number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("result is: " + result);
    }
}