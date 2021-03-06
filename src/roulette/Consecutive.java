package roulette;

import roulette.Wheel.SpinResult;
import util.ConsoleReader;

public class Consecutive extends Bet {

	public Consecutive(String description, int odds) {
		super(description, odds);
	}
	
	public String placeBet() {
		return ""
				+ ConsoleReader.promptRange(
						"Enter first of three consecutive numbers", 1,
						Wheel.NUM_SPOTS - 3);
	}

	public boolean betIsMade(String betChoice, Wheel wheel) {
		int start = Integer.parseInt(betChoice);
		return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

	@Override
	public void place() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMade(SpinResult spinResult) {
		// TODO Auto-generated method stub
		return false;
	}

}
