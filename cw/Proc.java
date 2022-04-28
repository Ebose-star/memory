package cw;
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Proc {
    int id;
    LinkedList<Integer> memorySegment;
    
    public Proc(String s){
    }
    public LinkedList<Integer>[] parseInputString (String s){
		
		int id, index;
		LinkedList<Integer>[] comp;
		
		//number of components to look at, first being the pid
		id = s.split(",").length;
		
		//process id, followed by segments and their arguments
		comp = new LinkedList[id];
		
		//init all
		for (int i =0; i<id; i++){
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
		//for (int i =0; i<id; i++){
            System.out.println("dog");

        return comp;
    }

public String toString(){
    String output="";
    Iterator<Integer> iterator=memorySegment.iterator();
      while(iterator.hasNext()){
         //System.out.println(iterator.next()+" ");
  output=("ProcessId:"+ this.id + iterator.next()+" " );
}
 return output;
 
}    
    }


