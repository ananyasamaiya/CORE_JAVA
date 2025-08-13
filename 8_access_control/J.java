//for local variable there is no access control
// NOT EVEN DEFAULT
// for local variable access control is not applicable
class J{
        public static void main(String[] args)
        {
            public int a = 5;
              int d = 54;
            private int b = 3;
            protected int c = 1;
          
        }
}

// J.java:7: error: illegal start of expression
//             public int a = 5;
//             ^
// J.java:13: error: class, interface, enum, or record expected
// }
// ^
// 2 errors