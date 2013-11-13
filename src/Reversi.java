public class Reversi {

	public String printLegalMoves(String input) {
		char activePlayer = getTurn(input);
		char passivePlayer = activePlayer == 'B' ? 'W' : 'B';
		
		String output  = input.replaceAll(activePlayer+"("+passivePlayer+"+)\\.", activePlayer+"$10");
		output  = output.replaceAll("\\.("+passivePlayer+"+)"+activePlayer, "0$1"+activePlayer);
		return output;
	}
	
	public char getTurn(String input){
		return input.charAt(input.length() - 1);
	}

}