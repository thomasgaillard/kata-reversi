
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

		String output  = input.replaceAll("BW\\.","BW0");
		output  = output.replaceAll("\\.WB","0WB");
		if(isTurnForWhite(input)){
			output  = input.replaceAll("WB\\.","WB0");
			output  = output.replaceAll("\\.BW","0BW");		
		}
			
		return output;
			
		
	}
	
	public boolean isTurnForWhite(String input){
		return input.charAt(input.length() - 1) ==  'W';
	}

	
}
