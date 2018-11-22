import java.util.Random;

public class Die {

    int dieValue = 0;
    int dieSides = 0;
    private static Random random = new Random();  // int throw = random.nextInt(6) +1;


    public Die(int dieSides){
        this.dieSides = dieSides;
        //dieValue = random.nextInt(dieSides) +1;


    }

    public void setDieValue(int dieValue){
        this.dieValue = dieValue;
    }

    public int getDieSides(){
        return dieSides;
    }

    public int getDieValue(){
        return dieValue;
    }

    public void roll(){
        dieValue = random.nextInt(dieSides) +1;
    }

}
