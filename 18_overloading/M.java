class M{
    public static void main(String[] args){
        Bathua a = new Bathua();
        //prepareBathuaVegetable(a);
        prepareLeafyVegetable(a);

        Cholai b = new Cholai();
       // prepareCholaiVegetable(b);
        prepareLeafyVegetable(b);

        Norpa c = new Norpa();
       // prepareNorpaVegetable(c);
       prepareLeafyVegetable(c);
        
    }

    //static void prepareBathuaVegetable(Bathua a){
    static void prepareLeafyVegetable(Bathua a){
        
        System.out.println("----Prepare Bathua -----");
        System.out.println("Step 1");
        System.out.println("Step 4");
        System.out.println("Step 7");
        System.out.println("Step 9");
    }

    //static void prepareCholaiVegetable(Cholai a){
    static void prepareLeafyVegetable(Cholai b){
     
        System.out.println("----Prepare Cholai -----");
        System.out.println("Step 2");
        System.out.println("Step 3");
        System.out.println("Step 5");
        System.out.println("Step 7");
        System.out.println("Step 9");
    }

    //static void prepareNorpaVegetable(Norpa a){
    static void prepareLeafyVegetable(Norpa c){
     
        System.out.println("----Prepare Norpa -----");
        System.out.println("Step 1");
        System.out.println("Step 3");
        System.out.println("Step 5");
        System.out.println("Step 6");
        System.out.println("Step 8");
        System.out.println("Step 9");
    }

}