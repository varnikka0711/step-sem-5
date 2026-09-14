import java.util.*;

class PlacementRecordX7K {
    String studentName;
    String company;
    double packageLpa;

    PlacementRecordX7K(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class PlacementRecordManagementP4N {
    public static void main(String[] args) {
        PlacementRecordX7K[] records = {
            new PlacementRecordX7K("Ravi", "TCS", 4.5),
            new PlacementRecordX7K("Anitha", "Zoho", 6.2),
            new PlacementRecordX7K("Karthik", "Infosys", 4.0)
        };

        for (PlacementRecordX7K record : records) {
            record.printRecord();
        }
    }
}