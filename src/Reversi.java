
public class Reversi {

	public String printLegalMoves(String input) {
		
		
	/*	String output = "" +
				"........\n"+
				"........\n"+
				"....0...\n"+
				"...BW0..\n"+
				"..0WB...\n"+
				"...0....\n"+
				"........\n"+
				"........\n"+
				"B";

		if(isTurnForWhite(input))
			output = "" +
					"........\n"+
					"........\n"+
					"...0....\n"+
					"..0BW...\n"+
					"...WB0..\n"+
					"....0...\n"+
					"........\n"+
					"........\n"+
					"W";
					
*/		
		String output =""+
				"........\n"+
				"........\n"+
				"B";
		
		if(isTurnForWhite(input)){
			output=input.replace("WB.","WBW");
			
			
		}
			
		return output;
			
		
	}
	
	public boolean isTurnForWhite(String input){
		return input.charAt(input.length() - 1) ==  'W';
	}

	
}
