package jp.ac.uryukyu.ie.ex3.pair27;
public class ExDice extends Dice{
    private int minValue;
    private int maxValue;
    public ExDice(int minValue, int maxValue){
	super();
	this.minValue = minValue;
	this.maxValue = maxValue;
    }

    public void play(){
	int rValue = maxValue - minValue+1;
	int nValue = (int)(Math.random()*rValue) + minValue;
	setValue(nValue);
    }
}
