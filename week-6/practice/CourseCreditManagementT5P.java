class CourseF8M {
    String code;
    String title;
    int credits;
    int labCredits;

    public CourseF8M(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public CourseF8M(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }
}

public class CourseCreditManagementT5P {
    public static void main(String[] args) {
        CourseF8M theory = new CourseF8M("21CSC201J", "Data Structures", 4);
        CourseF8M lab = new CourseF8M("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(theory.code + " total credits: " + theory.totalCredits());
        System.out.println(lab.code + " total credits: " + lab.totalCredits());
    }
}