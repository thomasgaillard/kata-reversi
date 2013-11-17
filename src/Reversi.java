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
	
	public String[][] string2Matrix(){
		String[][] matrix = new String[][] { { "1", "2", "3", "4" }, { "5", "6", "7", "8" }, { "9", "10", "11", "12" } };
		return matrix;
	}
	
	public String[][] matrix2String(){
		String[][] matrix = new String[][] { { "1", "2", "3", "4" }, { "5", "6", "7", "8" }, { "9", "10", "11", "12" } };
		return matrix;
	}
	
	public String[][] transpose(String[][] matrix) {
		int width = matrix.length;
		int height = matrix[0].length;
		String[][] transpose = new String[height][width];
		  for (int x = 0; x < width; x++) {
		    for (int y = 0; y < height; y++) {
		    	transpose[y][x] = matrix[x][y];
		    }
		  }
		  return transpose;
	}
}