import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Player> players = new ArrayList<>();
        int choice = 0;
        while(choice != 4){

            System.out.println("Vad vill du göra?");
            System.out.println("1. skapa spelare");
            System.out.println("2. spela");
            System.out.println("3. se resultat");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice){
                case 1: initialize();
                break;
                //case 2: takeTurn();
                //break;
                //case 3: getWinners();
               // break;
            }



        }





        // Die die1 = new Die(scanner.nextInt());

        // die1.roll();

        // System.out.println(die1.dieSides);
        // System.out.println(die1.dieValue);


    }

    private static ArrayList<Player> initialize(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<Player>();

        System.out.println("Hur många skal spela?");
        int numberOfPlayers = scanner.nextInt();

        System.out.println("Hur många tärningar skal kastas?");
        int numberOfDice = scanner.nextInt();

        System.out.println("Välj sidor per tärning:");
        int sides = scanner.nextInt();


        int nr = 1;
        scanner.nextLine();
        for (int i = 0; i < numberOfPlayers; i++) {

            System.out.println("Skriv inn player " + nr + ":s namn:");
            String name = scanner.nextLine();
            Player player = new Player(name);
            players.add(player);

            nr++;
        }

        for(Player player: players){
             for(int i = 0; i < numberOfDice; i++){
                 player.addDie(sides);
             }
        }
        //System.out.println(players);
        return(players);
    }

    private static void takeTurn(ArrayList<Player> players){
        Scanner scanner = new Scanner(System.in);

        for(Player player: players){

            player.rollDice();
            int dieSum = player.getDieValue();
            System.out.println("Gissa på summan!");
            int guess = scanner.nextInt();

            if(guess == dieSum){
                player.increaceScore();
            }
        }

    }

    private static ArrayList<Player> getWinners(ArrayList<Player> players){
        ArrayList<Player> winner = new ArrayList<>();

        return(winner);

    }


}
