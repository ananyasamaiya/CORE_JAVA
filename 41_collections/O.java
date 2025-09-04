import java.util.TreeMap;

class O {
    public static void main(String[] args){
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();

        map.put("vinay", 34);
        map.put("sajal", 12);
        map.put("keerti", 55);
        map.put("gitesh", 23);
        map.put("kamal", 79);
        map.put("nayan", 34);
        map.put("binay", 8);
        map.put("chatur", 55);
        map.put("tikku", 51);

        System.out.println(map);
        System.out.println(map.lastKey());
    }
}