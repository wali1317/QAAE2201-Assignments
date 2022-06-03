public class Holiday {
    String name;
    int day;
    String month;

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

    public boolean inSameMonth(Holiday hol) {
        return this.month.equals(hol.month);
    }

    Holiday hol = new Holiday("Independence Day", 4, "July");
}
