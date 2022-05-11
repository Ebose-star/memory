package cw;


public class Segment {
  private int size;
  private int ProcID;
  private int segmentID;
  private boolean loadedToMemory;
  
  public Segment(int size, int ProcID, int segmentID){
    this.size=size;
    this.ProcID=ProcID;
    this.segmentID=segmentID;
    this.loadedToMemory=false;
    }

public int getSize(){
  return size; 
}
public int getSegmentID(){
  return segmentID; 
}
public int getProcID(){
  return ProcID; 
}
public boolean getloadedToMemory(){
  return loadedToMemory; 
}
public void setLoadedToMemory(boolean load){
this.loadedToMemory = load;
}

}
