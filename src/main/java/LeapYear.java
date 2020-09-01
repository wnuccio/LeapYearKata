public class LeapYear {
    public boolean isLeap(int year) {
        boolean divisibleBy4 = year % 4 == 0;
        return divisibleBy4;
    }
}
