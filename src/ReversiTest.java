import static org.junit.Assert.*;

import org.junit.Test;


public class ReversiTest {

	@Test
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
}
