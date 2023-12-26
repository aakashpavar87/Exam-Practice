package Classes;
public class Enum {
    public enum days {
        MONDAY(100), TUESDAY(120), WEDNESDAY(32), THURSDAY(34), FRIDAY(456), SATURDAY(12), SUNDAY(32);
        private int n;
        private days(int n) {
            this.n = n;
        }
    }

    public static void main(String[] args) {
        days day = days.MONDAY;
        System.out.println("Value is : " + day.valueOf("MONDAY"));
        for (days newday : days.values()) {
            System.out.println("Day : " + newday + " Ordinal Value : " + newday.n);
        }
    }
}
