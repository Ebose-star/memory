package cw;
import java.util.LinkedList;

public class Proc {
    int id;
    LinkedList<Integer> linkedList;

    public Proc(String s){
		linkedList =new LinkedList<Integer>();
        this.id = Integer.parseInt(s.split(",")[0]);
        for (int i = 1; i < s.split(",").length; i++){
		      s = s.replaceAll("\\s+","");
		     linkedList.add(Integer.parseInt(s.split(",")[i]));
            //System.out.print(Integer.parseInt(s.split(",")[i])+" ");
		}
} 
	public int getElementFromListById(int N){
		return linkedList.get(N);
		
	}
public int getId(){
	return id;

}	

public LinkedList<Integer> getLinkedList() {
	return linkedList;
}


public String toString(){
	String accumulator = "";
	accumulator = accumulator + "ID: " +this.id + " Memory segments: ";
	for (int i = 0; i < linkedList.size(); i++) {
	accumulator = accumulator + linkedList.get(i)+ " ";
	}
	return accumulator;
	}
}

 