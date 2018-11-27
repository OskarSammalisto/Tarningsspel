import java.util.ArrayList;

public class Player {
    String name;
    int points;
    Die die;
    int score;

    ArrayList<Die> playerDices = new ArrayList<Die>();

    public Player(String name){
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }



    public void rollDice(){

        for(Die die : playerDices){
            die.roll();
        }
    }

    public int getDieValue(){
        int totalValue = 0;
        for(int i = 0; i < playerDices.size(); i++){

            totalValue += die.getDieValue(); //säkert fel!!!!
        }
        return totalValue;
    }

    public void increaceScore(){
        score++;
    }

    public void addDie(int sides){
        Die die = new Die(sides);
        playerDices.add(die);
    }
}
