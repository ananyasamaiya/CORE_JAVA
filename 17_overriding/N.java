// this exampke show that this is
// NOT  METHOD OVERRINDING NOT METHOD OVERLOADING

class Y5{
    private void pro(){
        System.out.println("pro() in parent");
    }
}

class N extends Y5{
    int pro()
    {
        System.out.println("pro() in child");

        return 1;
    }
}