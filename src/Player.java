import java.util.ArrayList;

public class Player {
    String name;
    int points;
    ArrayList<Die> playerDices = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }



    public void rollDice(){
        for(int i = 0; i < playerDices.size(); i++){
            playerDices.get(i).dieValue
        }
    }

    public int getDieValue(){
        int score = 0;
        for(int i = 0; i < playerDices.size(); i++){
            score = score + playerDices.indexOf(i); //säkert fel!!!!
        }
        return score;
    }
}
