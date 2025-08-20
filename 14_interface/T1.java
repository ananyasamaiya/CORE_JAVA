class A2{ }
class B2{ }

interface D2 { }
interface E2 { }

interface C2 extends A2{ }  //not ok

interface C2 extends A2, B2{ }  //not ok

interface C2 extends D2 { }  //ok

interface C2 extends D2,E2 { }  //ok

// ~~~~~~~~~~~~~~~~~~~~~~~~~~

interface C2 implements A2{ }  //not ok

interface C2 implements A2,B2{ }  //not ok

interface C2 implements D2{ }  //not ok

interface C2 implements D2, E2{ }  //not ok