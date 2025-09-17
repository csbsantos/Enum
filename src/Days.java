public enum Days {MONDAY(1, true),
    TUESDAY(2, true),
    WEDNESDAY(3, true),
    THURSDAY(4, true),
    FRIDAY (5, true),
    SATURDAY (6, false),
    SUNDAY (7, false);


    private int number;
    private boolean weekday;

    Days(int number, boolean weekday) {
        this.number = number;
        this.weekday= weekday;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWeekday() {
        return weekday;
    }
}
