//as the method is private it is not inherited 
//so we can't redefined it 
//it is just a conicidence that both have same name
// it can have any access control doesn't depend on parent class


class Y4{
    private void pro(){
        System.out.println("pro() in parent");
    }
}

//NOT A METHOD OVERRIDIND

class M extends Y4{
    // private void pro(){
    //     System.out.println("pro() in child");
    // }

    //  void pro(){
    //     System.out.println("pro() in child");
    // }

    // protected void pro(){
    //     System.out.println("pro() in child");
    // }

    // public void pro(){
    //     System.out.println("pro() in child");
    // }



}