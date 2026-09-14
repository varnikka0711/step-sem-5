class EmployeeR6T {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public EmployeeR6T(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public EmployeeR6T(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class EmployeeProfileCreationM8Q {
    public static void main(String[] args) {
        EmployeeR6T permanent = new EmployeeR6T("E-101", "Divya", 65000);
        EmployeeR6T intern = new EmployeeR6T("E-102", "Arjun");

        permanent.printProfile();
        intern.printProfile();
    }
}