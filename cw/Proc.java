package cw;
import java.util.HashMap;
import java.util.LinkedList;

public class Proc {
    int id;
    //LinkedList<Integer> linkedList;
	LinkedList<Segment>listOfSegments;
HashMap<Segment,Boolean> f ;

    public Proc(String s){
		f = new HashMap<Segment, Boolean>();
		listOfSegments =new LinkedList<Segment>();
        this.id = Integer.parseInt(s.split(",")[0]);
        for (int i = 1; i < s.split(",").length; i++){
		      s = s.replaceAll("\\s+","");
			  Segment f =new Segment(Integer.parseInt(s.split(",")[i]), this.id, i);
			  listOfSegments.add(f);
			  
            //System.out.print(Integer.parseInt(s.split(",")[i])+" ");
		}
		
} 
	public Segment getElementFromListById(int N){
		return listOfSegments.get(N);
		
	}
public boolean removeElementFromListById(int N){
	return f.remove( N, true);

}

public int getId(){
	return id;

}	

public LinkedList<Segment> getListOfSegments() {
	return listOfSegments;
}


public String toString(){
	String accumulator = "";
	accumulator = accumulator + "ID: " +this.id + " Memory segments: ";
	for (int i = 0; i < listOfSegments.size(); i++) {
	accumulator = accumulator + "SegmentID: "+ listOfSegments.get(i).getSegmentID()+ " size: "+  listOfSegments.get(i).getSize()+ " ";
	}
	return accumulator;
	}

}


 