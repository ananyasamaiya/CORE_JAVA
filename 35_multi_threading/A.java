// toString() is overridden meaning fully print "THread[nameOfTread,priority,nameOFGroupInWhichThatThreadBelongs]"
class A{
    public static void main(String[] args){
        Thread x = Thread.currentThread();

        System.out.println(x);
    }
}