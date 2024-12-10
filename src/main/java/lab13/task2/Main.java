package lab13.task2;

public class Main {
    public static void main(String[] args) {
        ReportBuilder reportBuilder = new ReportBuilder();

        if (reportBuilder.authorize()) {
            System.out.println("Authorization successful.");
        } else {
            System.out.println("Authorization failed.");
            return;
        }

        reportBuilder.buildReport();
    }
}
