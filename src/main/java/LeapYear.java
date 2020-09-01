public class LeapYear {
    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    private boolean divisibleBy(int divisor) {
        return year % divisor == 0;
    }

    public boolean isLeap() {
        if (divisibleBy(100)) return new LeapYear(year/100).isLeap();
        return divisibleBy(4);
    }
}
