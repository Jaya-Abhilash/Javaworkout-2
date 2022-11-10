package FacultySalary;

public class Faculty {
    private int facultyId;
    private double salary;
    Faculty(int facultyId,double salary){
        this.facultyId = facultyId;
        this.salary = salary;
    }
    protected void printFacultyDetails() {
        System.out.println("Faculty Details"+"\n"+ "Faculty ID:"+this.facultyId + "\n"+ "Salary:"+this.salary );
    }
}
