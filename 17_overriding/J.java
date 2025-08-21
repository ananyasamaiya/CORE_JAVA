//check the access control of overridding method the access control of overridding method can be
//1 SAME
//2 Wider

//ascending
//private
//Default 
//protected 
//public

class Y1{
    void pro(){
        System.out.println("pro() in parent");
    }
}

class J extends Y1{

    //private access control
    //attempting to assign weaker access privileges was package
    // private void pro()
    // {
    //     System.out.println("pro() in child");
    // }

    //public access control
    // public void pro()
    // {
    //     System.out.println("pro() in child");
    // }

    //protected access control
    // protected void pro()
    // {
    //     System.out.println("pro() in child");
    // }

    //Default access control
     void pro()
    {
        System.out.println("pro() in child");
    }

}