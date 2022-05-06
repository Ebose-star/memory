package cw;

public class MyApp {
    public static void main(String[] args){
        Proc p = new Proc("1, 100, 200, 20");
        Memory m = new Memory(124, 1024);
        System.out.print(m.toString() + " \n");
        System.out.println(p.toString());
//  Proc p2 = new Proc("2, 100, 10, 20, 30");
//  System.out.println(p2.toString());
    }
}