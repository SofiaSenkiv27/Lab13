package lab13.task2;

public class ReportBuilder {
    public String getUserData() {
        return "hello"; 
    }

    public String getStatisticalData() {
        return "hello2"; 
    }

    public boolean authorize() {
        getUserData(); 
        return true;
    }

    public void buildReport() {
        String userData = getUserData();
        String statisticalData = getStatisticalData();

        System.out.println("Building report:");
        System.out.println("User Data: " + userData);
        System.out.println("Statistical Data: " + statisticalData);
    }
}
