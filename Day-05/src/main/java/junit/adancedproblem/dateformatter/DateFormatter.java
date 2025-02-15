package junit.adancedproblem.dateformatter;



import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public String formatDate(String inputDate) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (Exception e) {
            return null; // Return null if the date format is invalid
        }
    }

    public static void main(String[] args) {
        DateFormatter formatter = new DateFormatter();
        System.out.println("Formatted Date: " + formatter.formatDate("2025-02-15"));
    }
}