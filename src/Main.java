import jp.ac.uryukyu.ie.ex3.pair27.Dice;
import jp.ac.uryukyu.ie.ex3.pair27.ExDice;

public class Main{
    public static void main(String[] args){
        Dice dice = new Dice();
        System.out.println(dice.getValue());
	ExDice exdice = new ExDice(5,7);
	for(int i=0;i<=10;i++){
	    exdice.play();
	    System.out.println("ExDiceかな"+exdice.getValue());
	}
    }
}