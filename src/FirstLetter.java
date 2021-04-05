import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstLetter {
    public static void main(String[] args) {
        String str = "Regina Mary Krishnagiri";
        String[] arrStr = str.split(" ");

        for(int i=0;i< arrStr.length;i++)
        {
            String m = arrStr[i];
            m.charAt(0);
            System.out.println(m.charAt(0));
        }

    }
}
