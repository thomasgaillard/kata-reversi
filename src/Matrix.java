public class Matrix {
	private String[] matrix;
	
	public Matrix(String str){
		this.matrix = str.split("\n");
	}
	
	public String toString(){
		String ret  = "";
		for(int x= 0; x < this.matrix.length; x++)
			ret += this.matrix[x] + "\n";
		return ret.substring(0, ret.length()-1);
	}
	
	public void transpose(){
		String trans[] = new String[this.matrix[0].length()];
		scourColumns(trans);
		this.matrix = trans;
	}

	public void scourColumns(String[] trans) {
		for(int x= 0; x < this.matrix[0].length(); x++){
			trans[x] = "";
			scourLines(trans, x);
		}
	}

	public void scourLines(String[] trans, int x) {
		for(int y= 0; y < this.matrix.length; y++)
			trans[x] += this.matrix[y].charAt(x) + "";
	}
}