package datetime.homework2;

import java.util.Calendar;

public class Ex2 {
    public static void main(String[] args) {
        Calendar calOne = Calendar.getInstance();
        int dayOfYear = calOne.get(Calendar.DAY_OF_YEAR);
        int year = calOne.get(Calendar.YEAR);
        System.out.println("Current Year: "+year);
    }
}
