class StudentJ4Q {
    String name;
    double attendance;

    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    StudentJ4Q(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class StudentCollegeManagementR8T {
    public static void main(String[] args) {
        StudentJ4Q student1 = new StudentJ4Q("Ravi", 85.5);
        StudentJ4Q student2 = new StudentJ4Q("Anitha", 92.0);

        StudentJ4Q.printCollegeInfo();
    }
}