class Q{
    public static void main(String[] args){
        String x = "internationalization";
        

        int res = x.indexOf('i');
        
        while(res != -1){
            System.out.println(res);
            res = x.indexOf('i',res+1);
            
        }
    }
}