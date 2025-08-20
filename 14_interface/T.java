class B1{ }
class C1{ }

interface D1 { }
interface E1 { }
interface F1 { }

class A1 extends B1 { }  //ok

class A1 extends C1, B1 { }  //not ok

class A1 extends D1 { }  //not ok

class A1 extends D1,E1 { }  //not ok

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~

class A1 implements B1{ }   //not ok

class A1 implements B1, C1{ }   //not ok

class A1 implements D1{ }   //ok

class A1 implements D1, E1{ }   // ok