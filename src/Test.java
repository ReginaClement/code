import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Emp, Integer> map = new HashMap<>();
        Emp emp1 = new Emp(100);
        Emp emp2 = new Emp(100);
        map.put(emp1, 1000);
        map.put(emp2, 300);

        map.forEach((k, v) -> System.out.println(k +" "+v));
    }
}


class Emp {
    int id;

    public Emp() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public Emp(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
