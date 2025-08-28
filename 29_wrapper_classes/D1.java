class D1{
    public static void main(String[] args){
        Double d = new Double("3.4a5");

        System.out.println(d);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "3.4a5"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
//         at java.base/java.lang.Double.parseDouble(Double.java:651)
//         at java.base/java.lang.Double.<init>(Double.java:733)
//         at D1.main(D1.java:3)