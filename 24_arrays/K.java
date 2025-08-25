class K{
    public static void main(String[] args){
        String[] y = new String[4];

        // System.out.println(y[0]);
        // System.out.println(y[1]);
        // System.out.println(y[2]);
        // System.out.println(y[3]);

        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }

        y[0] = "mohan";
        y[1] = new String("om");
        y[2] = new String("golu");
        y[3] = new String("raju");

        System.out.println("~~~~~~~~~");

        // System.out.println(y[0]);
        // System.out.println(y[1]);
        // System.out.println(y[2]);
        // System.out.println(y[3]);

        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }
    }
}