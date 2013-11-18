public class Reversi {

	public String printLegalMoves(String input) {
		char activePlayer = getTurn(input);
		char passivePlayer = activePlayer == 'B' ? 'W' : 'B';

		//remove last char -> activePlayer
		input = input.substring(0, input.length()-1);
		//verify lines
		String verifiedLines = verifyLegalMoves(input, activePlayer, passivePlayer);
		//create matrix and transpose to verify columns
		Matrix m = new Matrix(verifiedLines);
		m.transpose();
		String verifiedColumnsTranspose = verifyLegalMoves(m.toString(), activePlayer, passivePlayer);
		//transpose again to get the original matrix
		Matrix m2 = new Matrix(verifiedColumnsTranspose);
		m2.transpose();
		//add the active player
		return m2.toString()+"\n"+activePlayer;
	}

	private String verifyLegalMoves(String input, char activePlayer, char passivePlayer) {
		String output  = input.replaceAll(activePlayer+"("+passivePlayer+"+)\\.", activePlayer+"$10");
		output  = output.replaceAll("\\.("+passivePlayer+"+)"+activePlayer, "0$1"+activePlayer);
		return output;
	}
	
	public char getTurn(String input){
		return input.charAt(input.length() - 1);
	}
}