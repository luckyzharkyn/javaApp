package enums;

import codeMu.Helper;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();

        WeekDays w = WeekDays.SUNDAY;
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        Helper.show(w15);
        WeekDays [] weekDays = WeekDays.values();
        Helper.show(Arrays.toString(weekDays));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
    private WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return this.mood;
    }



}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                Helper.show("work");
                break;
            case SATURDAY:
            case SUNDAY:
                Helper.show("relax");
                break;
        }
        Helper.show("nastroenie = " + weekDay.getMood());
    }
}
