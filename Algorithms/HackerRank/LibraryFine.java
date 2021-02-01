package HackerRank;

import java.text.ParseException;

/**
 * @author Bhaskar on 30-01-2021
 */
public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) throws ParseException {
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMYYYY");
        LocalDate endDate = LocalDate.of(y1,m1,d1);
        LocalDate startDate = LocalDate.of(y2,m2,d2);
        return Math.abs(Period.between(endDate,startDate).getDays());*/
        if(y1 > y2)
            return 10000;
        if(y2 > y1)
            return 0;
        if(m1 < m2)
            return 0;
        if(m1 > m2)
            return (m1 - m2) * 500;

        if(d1 > d2)
            return (d1 - d2) * 15;
        return 0;
    }

    public static void main(String[] args) throws ParseException {

        System.out.println(libraryFine(12,06,2020,19,06,2021));

    }

}
