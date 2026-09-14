class HallTicketT6P {
    String studentName;
    int seatNumber;

    HallTicketT6P(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class ExamHallTicketManagementK3R {
    public static void main(String[] args) {
        HallTicketT6P priya = new HallTicketT6P("Priya", 0);

        HallTicketT6P copy = priya;
        copy.seatNumber = 45;

        HallTicketT6P separate = new HallTicketT6P("Priya", 45);

        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
    }
}