import HashT.HashTable;
import org.junit.Test;

import java.util.NoSuchElementException;

public class HashTest {
    @Test
    public void test() {
        HashTable table = new HashTable();
        table.put("Апельсин", "50");
        table.put("Банан", "30");
        table.put("Апельсин", "60");
        table.delete("Апельсин");
        table.delete("Анго");
        System.out.println(table);
        System.out.println(table.get("Банан"));
        System.out.println(table.contains("Банан"));
        System.out.println(table.contains("Апельсин"));
    }

    @Test(expected = NoSuchElementException.class)
    public void exceptionTest() {
        HashTable table = new HashTable();
        System.out.println(table.get("Апельсин"));
    }
}



