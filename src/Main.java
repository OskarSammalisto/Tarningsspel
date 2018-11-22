import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Välj sidor på tärning:");
	//int sides = scanner.nextInt();
    Die die1 = new Die(scanner.nextInt());

    die1.roll();

    System.out.println(die1.dieSides);
    System.out.println(die1.dieValue);


    }
}
