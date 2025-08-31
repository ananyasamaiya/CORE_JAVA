//we can't write finally between try and catch 
class C{
    public static void main(String[] args){
        try{

        } catch(ArithmeticException e){

        } catch(NullPointerException e){

        }finally{

        } catch(ClassCastException e){

        }
    }
}

// C.java:12: error: 'catch' without 'try'
//         } catch(ClassCastException e){
//           ^
// 1 error