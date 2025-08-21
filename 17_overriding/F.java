//can't mark overridden method final

class X5{
    final void pro()
    {

    }
}

class E extends X5{
     void pro()
    {

    }
}

// F.java:11: error: pro() in E cannot override pro() in X5
//      void pro()
//           ^
//   overridden method is final
// 1 error
