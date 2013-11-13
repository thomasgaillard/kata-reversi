
public class Reversi {

	public String printLegalMoves(String input) {

		String output  = input.replaceAll("B(W+)\\.", "B$10");
		output  = output.replaceAll("\\.(W+)B", "0$1B");
		if(isTurnForWhite(input)){
			output  = input.replaceAll("W(B+)\\.", "W$10");
			output  = output.replaceAll("\\.(B+)W", "0$1W");
		}	
		return output;
	}
	
	public boolean isTurnForWhite(String input){
		return input.charAt(input.length() - 1) ==  'W';
	}

}
