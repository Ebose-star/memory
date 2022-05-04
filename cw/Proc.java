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

class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
} 
class j 
{ 
    Node head; //the head of list 
  
    /* Takes index as argument and return data at index*/
	public int getElementFromListById(int N){    { 
        Node current = head; 
        int count = 0; /* index of Node we are 
                          currently looking at */
        while (current != null) 
        { 
            if (count == N) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
  
        /* if we get to this line, the caller was asking 
        for a non-existent element so we assert fail */
        assert(false); 
        return 0; 
    } 
	}
}

