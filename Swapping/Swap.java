package Swapping;

public class Swap {
    public static void main(String[] args) {
        swapNumber swapnumber = new swapNumber(6,5);
        swapnumber.swapNumberByReference();
        System.out.println("Swap By Reference"+" "+"num1="+swapnumber.getNum1() +" "+ "num2="+swapnumber.getNum2());
        swapnumber.swapNumberByValue();
        System.out.println("Swap By Value"+" "+"num1="+swapnumber.getNum1() +" " +"num2="+swapnumber.getNum2());
    }
}
