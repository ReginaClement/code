import com.sun.javafx.collections.MappingChange;

import javax.jnlp.ClipboardService;
import java.util.*;

public class DescendingOrderLetetr {
    public static void main(String[] args) {
        Order order = new Order();
        Map<String, Integer> stringIntegerMap = order.desOrder();
        Map<String,Integer> map= new HashMap<>();
        stringIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered
                (i->map.put(i.getKey(), i.getValue()));
        System.out.println(map);

    }
static class Order {
    private static Map<String, Integer> desOrder() {
        String str = "banana";
        String[] arrStr = str.split("");
        int count =1;
        //Set<String> set = new HashSet<>();
        //List<String> set =new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i< arrStr.length;i++) {
            if(map.containsKey(arrStr[i]))
            {
                map.put(arrStr[i],count+1);
            }
            else
            {
                map.put(arrStr[i],count);
            }
        }
        System.out.println("return" +map);
        return map;


    }

}
}
