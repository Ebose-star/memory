package cw;

public class Memory {
    private int total_size;
	
	/**
	 * Main Memory Constructor 
	 * @param size is total memory size 
	 */
	public Memory(int size) {
		this.total_size = size;
	}
	
	/**
	 * Method for the total size of the Main Memory
	 * @param none 
	 * @return actual size if it has been defined
	 * @return -1 if not defined
	 */
	public int getTotalSize() {
		return total_size;
	}	
}
