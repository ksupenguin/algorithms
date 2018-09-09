package HashT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class HashTable {
    private static final int DEFAULT_NUM_OF_BUCKETS = 16;
    private List<List<Item>> buckets = new ArrayList<List<Item>>();

    public HashTable() {
        for (int i = 0; i < DEFAULT_NUM_OF_BUCKETS; i++) {
            buckets.add(new ArrayList<Item>());
        }
    }

    public void put(String key, String value) {
        int index = bucketIndex(key);
        List<Item> items = buckets.get(index);
        if (items.isEmpty()) {
            Item item = new Item(key, value);
            items.add(item);
        } else {
            for (Item item : items) {
                if (key.hashCode() == item.getKey().hashCode() && key.equals(item.getKey())) {
                    item.setValue(value);
                    return;
                }
            }
            Item item = new Item(key, value);
            items.add(item);
        }
    }

    public void delete(String key) {
        int index = bucketIndex(key);
        List<Item> items = buckets.get(index);
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (key.hashCode() == item.getKey().hashCode() && key.equals(item.getKey())) {
                iterator.remove();
            }
        }
    }

    public String get(String key) {
        int index = bucketIndex(key);
        List<Item> items = buckets.get(index);
        for (Item item : items) {
            if (key.hashCode() == item.getKey().hashCode() && key.equals(item.getKey())) {
                return item.getValue();
            }
        }
        throw new NoSuchElementException("There is no Item with this key");
    }

    public boolean contains(String key) {
        int index = bucketIndex(key);
        List<Item> items = buckets.get(index);
        for (Item item : items) {
            if (key.hashCode() == item.getKey().hashCode() && key.equals(item.getKey())) {
                return true;
            }
        }
        return false;
    }

    private int bucketIndex(String key) {
        return key.hashCode() & (DEFAULT_NUM_OF_BUCKETS - 1);
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "buckets=" + buckets +
                '}';
    }
}
