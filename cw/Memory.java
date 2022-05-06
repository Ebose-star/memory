package cw;

public class Memory {
    private int os_size;
	 private int hole; 
	/**
	 * Main Memory Constructor 
	 * @param i
	 * @param os_size is total memory size 
	 */
	public Memory(int os_size, int hole) {
		this.os_size = os_size;
		this.hole= hole;
	}
	public String toString(){
		String output=" ";
		output = "[OS " + this.os_size + "] " + " Hole: " +this.hole;
		return output;

	}	
}
