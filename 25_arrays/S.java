class S{
    public static void main(String[] args){
        String[][] arr = new String[3][2];
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println("~~~~~~~~~~~~~~~");

        arr[0][0] = "mohan";
        arr[0][1] = "om";
        arr[1][0] = "shayam";
        arr[1][1] = "ram";
        arr[2][0] = "raju";
        arr[2][1] = "rita";
        
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

    }
}