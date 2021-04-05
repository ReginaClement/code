public class Name
{
    public static void main(String[] args) {
        String str = "madam";
        int count=0;
        String[] split = str.split("");
        for (int i = 0; i<str.length(); i++) {
            for (int j=i+1; j<str.length(); j++) {
                if (split[i].equals(split[j])) {
                    System.out.println(split[i]);
                }
            }
        }


    }
}
