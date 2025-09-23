enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class N {
    public static void main(String[] args){
        Days[] all = Days.values();

        for(Days next : all) {
            System.out.println(next);
        }
    }
}