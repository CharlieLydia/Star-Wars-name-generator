import java.util.Scanner;

public class NameGenerator {
    private String firstName;
    private String lastName;
    private String starWarsName;

    public NameGenerator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        firstName = sc.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = sc.nextLine();
        sc.close();
        threeLetters();
        printName();
    }

    public void threeLetters() {
        String firstThreeLetters = firstName.substring(0, 3);
        String firstTwoLetters = lastName.substring(0, 2);
        starWarsName = firstThreeLetters + firstTwoLetters;
    }

    public void printName() {
        System.out.println("Your Star Wars name is " + starWarsName);
    }
}

