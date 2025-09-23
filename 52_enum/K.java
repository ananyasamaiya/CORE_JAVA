class A11 {
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
}

class K {
    public static void main(String[] args) {
        A11.Days d = A11.Days.MONDAY;

        System.out.println(d);
    }
}