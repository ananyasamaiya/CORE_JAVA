class Y2{
    protected void pro(){
        System.out.println("pro() in parent");
    }
}

class K extends Y2{
    //  attempting to assign weaker access privileges; was protected
    // private void pro()
    // {
    //    System.out.println("pro() in chid"); 
    // }

    //  attempting to assign weaker access privileges; was protected
    // void pro()
    // {
    //    System.out.println("pro() in chid"); 
    // }

    // public void pro()
    // {
    //    System.out.println("pro() in chid"); 
    // }

    // protected void pro()
    // {
    //    System.out.println("pro() in chid"); 
    // }
}