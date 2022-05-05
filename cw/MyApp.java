package cw;

public class MyApp {
    public static void main(String[] args){
        Proc p = new Proc("1, 100, 200, 20");
        Proc p2 = new Proc("2, 100, 10, 20, 30");
        System.out.println(p.toString());
        System.out.println(p2.toString());
        //System.out.println(p.getElementFromListById(0));
    //p.toString();
    }
}