import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ReversiTest {
		@Parameters
		public static Collection<Object[]> data() {
			return Arrays.asList(new Object[][] {
//					{
//						"" +
//						"........\n"+
//						"........\n"+
//						"........\n"+
//						"...BW...\n"+
//						"...WB...\n"+
//						"........\n"+
//						"........\n"+
//						"........\n"+
//						"B",
//
//						"" +
//						"........\n"+
//						"........\n"+
//						"....0...\n"+
//						"...BW0..\n"+
//						"..0WB...\n"+
//						"...0....\n"+
//						"........\n"+
//						"........\n"+
//						"B"
//					},
//					{  
//						"" +
//						"........\n"+
//						"........\n"+
//						"........\n"+
//						"...BW...\n"+
//						"...WB...\n"+
//						"........\n"+
//						"........\n"+
//						"........\n"+
//						"W",
//
//						"" +
//						"........\n"+
//						"........\n"+
//						"...0....\n"+
//						"..0BW...\n"+
//						"...WB0..\n"+
//						"....0...\n"+
//						"........\n"+
//						"........\n"+
//						"W"
//					},
					{ 
						"" +
						"........\n"+
						"........\n"+
						"B",
						"" +
						"........\n"+
						"........\n"+
						"B"
					},
					{ 
						"" +
						"........\n"+
						"........\n"+
						"W",
					 
						"" +
						"........\n"+
						"........\n"+
						"W"
					},
					{
						"" +
						"..WB....\n"+
						"........\n"+
						"W",
						"" +
						"..WB0...\n"+
						"........\n"+
						"W"	
					},
					{
						"" +
						"..BW....\n"+
						"........\n"+
						"B",
						"" +
						"..BW0...\n"+
						"........\n"+
						"B"	
					},
					{
						"" +
						"..BW....\n"+
						"........\n"+
						"W",
						"" +
						".0BW....\n"+
						"........\n"+
						"W"	
					},
					{
						"" +
						"..WB....\n"+
						"........\n"+
						"B",
						"" +
						".0WB....\n"+
						"........\n"+
						"B"
					}
		    		});
	    }

	    @Parameter 
	    public String input;

	    @Parameter (value=1)
	    public String output;
		    
	    @Test
	    public void printLegalMovesShouldAnswerLegalMovesFromInput() {
		    Reversi game = new Reversi();
		    assertEquals(this.output, game.printLegalMoves(this.input));
		}
}