import static org.junit.Assert.*;

import org.junit.Test;


public class ReversiTest {

	/*@Test
	public void giveBlackLegalMovesAtBeginning(){
		String input = "" +
				"........\n"+
				"........\n"+
				"........\n"+
				"...BW...\n"+
				"...WB...\n"+
				"........\n"+
				"........\n"+
				"........\n"+
				"B";
		
		String output = "" +
				"........\n"+
				"........\n"+
				"....0...\n"+
				"...BW0..\n"+
				"..0WB...\n"+
				"...0....\n"+
				"........\n"+
				"........\n"+
				"B";
		Reversi jeux = new Reversi();
		assertEquals(output, jeux.printLegalMoves(input));
	}
	
	@Test
	public void giveWhiteLegalMovesAtBeginning(){
		String input = "" +
				"........\n"+
				"........\n"+
				"........\n"+
				"...BW...\n"+
				"...WB...\n"+
				"........\n"+
				"........\n"+
				"........\n"+
				"W";
		
		String output = "" +
				"........\n"+
				"........\n"+
				"...0....\n"+
				"..0BW...\n"+
				"...WB0..\n"+
				"....0...\n"+
				"........\n"+
				"........\n"+
				"W";
		Reversi jeux = new Reversi();
		assertEquals(output, jeux.printLegalMoves(input));
	}*/
	
	@Test
	public void giveBlackLegalMovesAfterBeginning(){
		String input = "" +
				"........\n"+
				"........\n"+
				"B";
				
		String output = "" +
				"........\n"+
				"........\n"+
				"B";	
				
				Reversi jeux = new Reversi();
				assertEquals(output, jeux.printLegalMoves(input));
	
}
	
	@Test
	public void giveWhitelegalMovesAfterFirstPlay(){
	
	String input = "" +
			"..WB....\n"+
			"........\n"+
			"W";
	
			
	String output = "" +
			"..WB0...\n"+
			"........\n"+
			"W";	
			
			Reversi jeux = new Reversi();
			assertEquals(output, jeux.printLegalMoves(input));
			}
}
