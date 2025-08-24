/*
we need to initialized final variable 
if it is instance we can initialized in constructor we have a change

if it is static memory is allocated at class object when class is loaded se we can't initialized it in constructor
*/

class Z7{
    final int x;

    Z7(){
        super();
        //---
        x = 9;
    }

    Z7(int y){
        x = y;
    }
}