package BHKFLATS;
import java.util.*;
public class oneBHK {
    private double roomArea;
    private double hallArea;
    private double price;

    oneBHK(){
        roomArea=0;
        hallArea=0;
        price=0;
    }

    oneBHK(double roomArea, double hallArea, double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show(){
        System.out.println("\nRoom Area: "+roomArea+"\nHall Area: "+hallArea+"\nprice: "+price);
    }
}

