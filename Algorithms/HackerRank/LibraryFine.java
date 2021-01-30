package HackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Bhaskar on 30-01-2021
 */
public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMYYYY");
        LocalDate endDate = LocalDate.of(y1,m1,d1);
        LocalDate startDate = LocalDate.of(y2,m2,d2);
        return Math.abs(Period.between(endDate,startDate).getDays());
    }

    public static void main(String[] args) throws ParseException {

        System.out.println(libraryFine(12,06,2020,19,06,2020));

    }

}
