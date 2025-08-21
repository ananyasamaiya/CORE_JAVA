//can mark overriding method final if we do not want to overriding it 

class X5{
     void pro()
    {

    }
}

class E extends X5{
    final void pro()
    {

    }
}

// F.java:11: error: pro() in E cannot override pro() in X5
//      void pro()
//           ^
//   overridden method is final
// 1 error
