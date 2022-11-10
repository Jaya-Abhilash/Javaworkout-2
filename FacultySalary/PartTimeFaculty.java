package FacultySalary;

public class PartTimeFaculty extends Faculty {
    private int hour;
    private double rate;
    PartTimeFaculty(int facultyId,int hour, double rate) {
        super(facultyId,hour*rate);
        this.hour = hour;
        this.rate = rate;
    }
    @Override
    public void printFacultyDetails(){
        super.printFacultyDetails();
        System.out.println("Faculty Type:"+"Part-time Time");
    }

}

