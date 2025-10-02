class D{
        static void write(Object a){
            System.out.println("inside Object");
        }
        static void write(String a){
            System.out.println("inside String");
        }

        public static void main(String[] args){
            write(null);
        }
    
}