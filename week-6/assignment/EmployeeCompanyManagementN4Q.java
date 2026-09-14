class EmployeeV8P {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeV8P(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeCompanyManagementN4Q {
    public static void main(String[] args) {
        EmployeeV8P employee1 = new EmployeeV8P("Ravi", 50000);
        EmployeeV8P employee2 = new EmployeeV8P("Anitha", 60000);
        EmployeeV8P employee3 = new EmployeeV8P("Karthik", 55000);

        EmployeeV8P.printCompanyInfo();
    }
}