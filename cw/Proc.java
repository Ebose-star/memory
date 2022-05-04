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
    public LinkedList<Integer>[] parseInputString (String s){
		int numberOfElementsInTheString;
		int size, index;
		LinkedList<Integer>[] comp;
		
		//number of components to look at, first being the pid
		numberOfElementsInTheString = s.split(",").length;
		
		//process id, followed by segments and their arguments
		comp = new LinkedList[this.id];
		
		//init all
		for (int i =0; i<this.id; i++){
			comp[i] = new LinkedList<Integer>();
		}

		index = 0;
		for (String part:s.split(",")) {
			//remove space
			part = part.replace(" ", "");	
			
			//see if options are declared by looking at [ and ]
			if (part.contains("[") && part.contains("]")){
				part = part.replace(" ", "").replace("[", "").replace("]", "");
				
				//split into options: size, read-write bit, shared list
				for (String split:part.split(";")) {
					comp[index].add(Integer.parseInt(split));
				}
			}else {
				comp[index].add(Integer.parseInt(part));
			}
			index++;
		}
		for (int i =0; i < numberOfElementsInTheString; i++){
    
    }
        return comp;
	}

	
public int getId(){
	return id;

}	

public LinkedList<Integer> getLinkedList() {
	return linkedList;
}


public String toString(){
   //String s=( this.id + " " );
String accumulator = "";

accumulator = accumulator + this.id;
System.out.print(accumulator + " ");
for (int i = 0; i < linkedList.size(); i++) {
	System.out.print(linkedList.get(i)+ " ");
	//System.out.print(Integer.parseInt(s.split(",")[i])+" ");
}
 return accumulator;
 
}
}


