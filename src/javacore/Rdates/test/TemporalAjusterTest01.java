package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek){
            case FRIDAY :
                addDays = 3;
        }
        return null;
    }
}

public class TemporalAjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

    }
}
