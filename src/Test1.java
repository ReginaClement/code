import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String args[]) {

        List<List<String>> list = new ArrayList<>();
        List<String> list1 = Arrays.asList("regime");
        List<String> list2 = Arrays.asList("regina");
        list.add(list1);
        list.add(list2);
        System.out.println(list);
        List<String> collect = list.stream().flatMap(i->i.stream()).collect(Collectors.toList());
        System.out.println(collect);


    }

}
