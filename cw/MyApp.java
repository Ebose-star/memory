package cw;


public class MyApp {
    public static void main(String[] args){
        Proc p = new Proc("1, 100, 200, 20");
       // Segment s = new Segment("100, 200, 20");
        Memory m = new Memory(124, 1024, null);
        System.out.print(m.toString() + " \n");
        System.out.println(p.toString());
      System.out.println("Add Segment P1.S1 to Main Memory from Process"+ p.toString());
      m.addSegment(0, p);
    
      System.out.println(m.toString());

 System.out.println("Add to Main Memory the Process "+ p.toString());
 m.addProcess (p); // or some variant of this form to all Segments of P1 in main memory.
// System.out.println(m.getHole());
System.out.println(m.toString());

    }

    

    
}