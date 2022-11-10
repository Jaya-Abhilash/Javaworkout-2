package BHKFLATS;

public class OneBHK {
    double roomArea;
     double hallArea;
    double price;

    OneBHK()
    {

    }

    OneBHK(double roomArea,double hallArea,double price)
    {
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show()
    {
        System.out.println("Room Area : "+this.roomArea+"squarefeet"+ "\nHall Area : "+this.hallArea+"squarefeet"+ "\nPrice : "+this.price);

    }
}

