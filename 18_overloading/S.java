class S{
    public static void main(String[] args){
        Account a = new Account();
        a.balance = 1000;
        
        Account b = new Account();
        b.balance = 5000;

        System.out.println(a + b);

    }
}

class Account{
    int balance;
}


// S.java:9: error: bad operand types for binary operator '+'
//         System.out.println(a + b);
//                              ^
//   first type:  Account
//   second type: Account
// 1 error