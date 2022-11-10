package BHKFLATS;

public class TwoBHK extends OneBHK{
    double room2Area;

    TwoBHK()
    {
        System.out.println("Created TwoBHK!");
    }

    TwoBHK(double roomArea,double room2Area,double hallArea,double price)
    {
        this.roomArea=roomArea;
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show()
    {
        System.out.println("Room1 Area : "+this.roomArea+"squarefeet"+"\nRoom2 Area : "+this.room2Area+"squarefeet"+ "\nHall Area : "+this.hallArea+"squarefeet"+ "\nPrice : "+this.price);

    }
}

