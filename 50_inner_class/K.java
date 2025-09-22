//can access even the private member of inner class in outer class
//by making a object of inner class

class K{
    class A{
        private void pro(){
            System.out.println("~~Some More Info");
        }
    }
    public static void main(String[] args){
        K k = new K();

        A a = k.new A();

        a.pro();
    }
}