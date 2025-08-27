class Y{
    public static void main (String[] args){
        DD[] x = {new Y1(),new Y2(),new Y3()};

        //-----------OR-------

        DD[] y = new DD[3];

        y[0] = new Y1();
        y[1] = new Y2();
        y[2] = new Y3();
    }
}

abstract class DD{

}

class Y1 extends DD{  }
class Y2 extends DD{  }
class Y3 extends DD{  }