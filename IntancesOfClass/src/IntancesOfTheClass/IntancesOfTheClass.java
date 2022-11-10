package IntancesOfTheClass;
public class IntancesOfTheClass {
    static int count;
    static int id;

    public IntancesOfTheClass()
    {
        count++;
    }
    public static void main(String [] a)
    {
        IntancesOfTheClass t1=new IntancesOfTheClass();
        IntancesOfTheClass t2=new IntancesOfTheClass();
        IntancesOfTheClass t3=new IntancesOfTheClass();
        IntancesOfTheClass t4=new IntancesOfTheClass();
        t1=null;
        t2=null;
        Runtime.getRuntime().gc();
        System.out.println("Objects created:"+count);
        System.out.println("Objects destroyed:"+id);
        System.out.println("Objects alive:"+(count-id));
    }
    protected void finalize()
    {
        id++;
    }
}
