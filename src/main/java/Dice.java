import java.util.Random;

public class Dice {
   private  int craps;

    public Dice ( int i ) {
        this.craps=i;
    }


       // Dice dice = new Dice(5); //yatzee


      Integer tossAndSum() {
            int diceNum1 = (int) (Math.random() * 6 + 1);
            int diceNum2 = (int) (Math.random() * 6 + 1);
           // System.out.println(diceNum1);
           // System.out.println(diceNum2);
            return diceNum1+diceNum2;

    }
}
