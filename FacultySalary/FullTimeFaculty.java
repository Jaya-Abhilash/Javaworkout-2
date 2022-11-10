package FacultySalary;

public class FullTimeFaculty extends Faculty {
    private double basic;
    private double allowance;

    FullTimeFaculty(int facultyId, double basic, double allowance) {
        super(facultyId, basic + allowance);
        this.basic = basic;
        this.allowance = allowance;

    }
    @Override
    public void printFacultyDetails(){
        super.printFacultyDetails();
        System.out.println("Faculty Type:"+"Full Time");
    }
}

