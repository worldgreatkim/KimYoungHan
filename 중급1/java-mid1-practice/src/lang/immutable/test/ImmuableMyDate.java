package lang.immutable.test;

import lang.immutable.address.ImmutableAddress;

public class ImmuableMyDate {
    private final int year;
    private final int month;
    private final int day;

    //생성자
    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmuableMyDate changeYear(int changeYear){
        return new ImmuableMyDate(changeYear,month, day);
    }

    public ImmuableMyDate changeMonth(int changeMonth){
        return new ImmuableMyDate(year,changeMonth,day);
    }
    public ImmuableMyDate changeDay(int changeDay){
        return new ImmuableMyDate(year,month,changeDay);
    }
//    public void setYear(int year) {
//        this.year = year;
//    }
//    public void setMonth(int month) {
//        this.month = month;
//    }
//    public void setDay(int day) {
//        this.day = day;
//    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
