package BHKFLATS;

public class DriverClass {
    public static void main(String[] args) {
        TwoBHK obj1=new TwoBHK(100,115,425,100000);
        TwoBHK obj2=new TwoBHK(115,120,430,150000);
        TwoBHK obk3=new TwoBHK(130,150,400,200000);

        int totalPrice= (int) (obj1.price+ obj2.price+ obk3.price);

        obj1.show();
        obj2.show();
        obk3.show();

        System.out.println("Total Amount of all Flats ="+totalPrice);
    }
}
