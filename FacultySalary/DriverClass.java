package FacultySalary;

public class DriverClass {
    public static void main(String[] args) {
        FullTimeFaculty fullTimeFaculty1 = new FullTimeFaculty(12145, 15000, 6000);
        FullTimeFaculty fullTimeFaculty2 = new FullTimeFaculty(12146, 20000, 4000);
        PartTimeFaculty partTimeFaculty1 = new PartTimeFaculty(12147, 8, 100);
        PartTimeFaculty partTimeFaculty2 = new PartTimeFaculty(12148, 7, 150);
        fullTimeFaculty1.printFacultyDetails();
        fullTimeFaculty2.printFacultyDetails();
        partTimeFaculty1.printFacultyDetails();
        partTimeFaculty2.printFacultyDetails();
    }
}
