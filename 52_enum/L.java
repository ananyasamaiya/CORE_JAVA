class L {
    static void pro() {
        enum Days {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        }

        Days d = Days.SUNDAY;

        System.out.println(d);
    }


    public static void main(String[] args) {
        L.pro();
    }    
}