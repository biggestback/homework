import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int number = 5;

        while (number < 100) {
            System.out.println(number);
            number = number + 3;
        }

    

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = scan.nextLine();

         if (word.length() > 0) {
            do {
                System.out.println(word);
                word = word.substring(1);
                } while (word.length() > 0);
        } 
    }
}
