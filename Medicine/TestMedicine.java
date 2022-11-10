package Medicine;
import java.util.Random;
public class TestMedicine {
    public static void main(String[] args) {
        Random random = new Random();
        int choice = 0;
        while (true) {
            choice = random.nextInt(4);
            if (choice != 0)
                break;
        }
        System.out.println("Random number is :"+choice);
        switch(choice){
            case 1 :
                Medicine t1=new Tablet();
                Medicine t2=new Tablet();
                Medicine t3=new Tablet();
                t1.displayLabel();
                break;

            case 2:
                Medicine s1=new Syrup();
                Medicine s2=new Syrup();
                Medicine s3=new Syrup();
                s2.displayLabel();
                break;

            case 3:

                Medicine o1=new Ointment();
                Medicine o2=new Ointment();
                Medicine o3=new Ointment();
                o3.displayLabel();
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
