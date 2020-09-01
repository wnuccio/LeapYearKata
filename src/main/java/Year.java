public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    private boolean divisibleBy(int divisor) {
        return year % divisor == 0;
    }

    public boolean isLeap() {
        if (divisibleBy(100)) return new Year(year/100).isLeap();
        return divisibleBy(4);
    }
}
