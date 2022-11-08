package BHKFLATS;
import java.util.*;
public class Flats {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TwoBHK obj1 = new TwoBHK(10,10,100,20);
        TwoBHK obj2 = new TwoBHK(12,15,1000,20);
        TwoBHK obj3 = new TwoBHK(11,15,1000,15);
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
