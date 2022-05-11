package cw;
import java.util.LinkedList;


public class Memory {
    private int os_size;
	 private int totalSize; 
	 private LinkedList<Segment>listOfSegments;
	/**
	 * Main Memory Constructor 
	 * @param i
	 * @param os_size is total memory size 
	 */
	public Memory(int os_size, int hole, LinkedList<Segment> listOfSegments) {
		listOfSegments =new LinkedList<Segment>();
		this.os_size = os_size;
		this.totalSize= hole-os_size;
		this.listOfSegments=listOfSegments;
	}
	public String toString(){
int hole=totalSize;
		String output=" ";
		output = "[OS " + os_size + "] ";
		for (Segment s : listOfSegments) {
			output = output + " [P" + s.getProcID() + " S" + s.getSegmentID() + " " + s.getSize() + "] ";
			hole = hole - s.getSize();
		}
		output = output + " Hole: " + hole;
		 return output;

	}
	public int getOs_size() {
		return os_size;
	}

	public int getHole() {
		return this.totalSize;
	}

	public void addSegment(int segment, Proc p) {
	  Segment s =p.getElementFromListById(segment);
	  if(!s.getloadedToMemory()){
		listOfSegments.add(s);
s.setLoadedToMemory(true);
	  }}
    
	public void addProcess(Proc p){
for(int i =0; i< p.listOfSegments.size(); i++){
	Segment segment = p.getElementFromListById(i);
	if(!segment.getloadedToMemory()){
	// System.out.println(segment);
	this.listOfSegments.add(segment);
	segment.setLoadedToMemory(true);
}}

	}
	

}
	
