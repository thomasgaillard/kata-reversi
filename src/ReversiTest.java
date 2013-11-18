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
					{
						"........\n"+
						"........\n"+
						"........\n"+
						"...BWW..\n"+
						"...WB...\n"+
						"...W....\n"+
						"........\n"+
						"........\n"+
						"B",

						"........\n"+
						"........\n"+
						"....0...\n"+
						"...BWW0.\n"+
						"..0WB...\n"+
						"...W....\n"+
						"...0....\n"+
						"........\n"+
						"B"
					},
					{  
						"........\n"+
						"........\n"+
						"........\n"+
						"...BW...\n"+
						"...WB...\n"+
						"........\n"+
						"........\n"+
						"........\n"+
						"W",

						"........\n"+
						"........\n"+
						"...0....\n"+
						"..0BW...\n"+
						"...WB0..\n"+
						"....0...\n"+
						"........\n"+
						"........\n"+
						"W"
					},
					{ 
						"........\nB",
						"........\nB"
					},
					{ 
						"........\nW",					 
						"........\nW"
					},
					{
						"..WB....\nW",
						"..WB0...\nW"
					},
					{
						"..BW....\nB",
						"..BW0...\nB"
					},
					{
						"..BW....\nW",
						".0BW....\nW"
					},
					{
						"..WB....\nB",
						".0WB....\nB"
					},
					{
						"..WWBB..\nB",
						".0WWBB..\nB"
					},
//					{
//						"W\n"+
//						"B\n"+
//						".\n"+
//						"W",
//						
//						"WB0W",
//					},
					{
						"W\n"+
						"B\n"+
						".\n"+
						"W",
						
						"W\n"+
						"B\n"+
						"0\n"+
						"W",
					},
					{
						"........\n"+
						"........\n"+
						"........\n"+
						"...BWW..\n"+
						"...WB...\n"+
						"..BW....\n"+
						"........\n"+
						"........\n"+
						"B",

						"........\n"+
						"........\n"+
						"....000.\n"+
						"...BWW0.\n"+
						"..0WB...\n"+
						"..BW....\n"+
						"...0....\n"+
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