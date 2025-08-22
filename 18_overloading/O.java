class O{
    public static void main(String[] args){
        Milk m = new Milk();
        Water w = new Water();
        TeaLeaves t = new TeaLeaves();
        Sugar s = new Sugar();
        Herbs h = new Herbs();

        //prepareMilkTea(w, s, t, m);
        prepareTea(w, s, t, m);
        // prepareBlackTea(w, s, t);
        prepareTea(w, s, t);
        // prepareHerbalTea(w, s, h);
        prepareTea(w, s, h);
    }

   // static void prepareMilkTea(Water w,Sugar s,TeaLeaves t,Milk m){
    static void prepareTea(Water w,Sugar s,TeaLeaves t,Milk m){
        System.out.println("----Prepare Milk Tea -----");
        System.out.println("Step 1");
        System.out.println("Step 3");
        System.out.println("Step 5");
        System.out.println("Step 6");
    }

    // static void prepareBlackTea(Water w,Sugar s,TeaLeaves t){
    static void prepareTea(Water w,Sugar s,TeaLeaves t){
        System.out.println("----Prepare Black Tea -----");
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");
        System.out.println("Step 4");
        System.out.println("Step 5");
    }

    // static void prepareHerbalTea(Water w,Sugar s,Herbs h){
    static void prepareTea(Water w,Sugar s,Herbs h){
        System.out.println("----Prepare Herbal Tea -----");
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");
        System.out.println("Step 4");
        System.out.println("Step 5");
        System.out.println("Step 6");
    }
}