public class Reversi {

	public String printLegalMoves(String input) {
		char activePlayer = getTurn(input);
		char passivePlayer = activePlayer == 'B' ? 'W' : 'B';
		
		input = input.substring(0, input.length()-1);
		String verifiedLines = verifyLegalMoves(input, activePlayer, passivePlayer);
 		String columnsTranspose = array2str(transpose(str2array(verifiedLines)));
		String verifiedColumnsTranspose = verifyLegalMoves(columnsTranspose, activePlayer, passivePlayer);
		String verifiedColumns = array2str(transpose(str2array(verifiedColumnsTranspose)));
		return verifiedColumns+"\n"+activePlayer;
	}

	private String verifyLegalMoves(String input, char activePlayer, char passivePlayer) {
		String output  = input.replaceAll(activePlayer+"("+passivePlayer+"+)\\.", activePlayer+"$10");
		output  = output.replaceAll("\\.("+passivePlayer+"+)"+activePlayer, "0$1"+activePlayer);
		return output;
	}
	
	public char getTurn(String input){
		return input.charAt(input.length() - 1);
	}
	
	public String[] str2array(String str){
		return str.split("\n");
	}
	
	public String array2str(String[] array){
		String ret  = "";
		for(int x= 0; x < array.length; x++){
			ret += array[x] ;
			if(x+1 < array.length){
				ret += "\n";
				
			}
		}
		return ret;
	}
	
	public String[] transpose(String[] array){
		System.out.println(array[0].length());
		String ret[] = new String[array[0].length()];
		for(int x= 0; x < array[0].length(); x++){
			ret[x] = "";
			for(int y= 0; y < array.length; y++){
				ret[x] += array[y].charAt(x) + "";
			}
		}
		return ret;
	}
}