import domain.DateFinder;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class FindDateTest {

    @Test
    public void findDateBeforeOneMonth() {
        LocalDate date= LocalDate.of(2021, 11, 25);
       // assertEquals(DateFinder.getDateBeforeMonth(date, 30), LocalDate.of(2021, 10, 26));
        assertEquals(DateFinder.getDateBeforeMonth(date, 4), LocalDate.of(2021, 11, 19));
      //  assertEquals(DateFinder.getDateBeforeMonth(date, 30), LocalDate.of(2021, 10, 26));
    }
}
