// Java program to handle collisions using a custom hash function using separate chaining
import java.util.LinkedList;

class MyHashmap<K, V> {
    private LinkedList<Entry<K, V> >[] buckets;
    private int capacity;

    public MyHashMap(int capacity)
    {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
      // Function to put value for key
    public void put(K key, V value)
    {
        int index = key.hashCode() % capacity;
        LinkedList<Entry<K, V> > bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }
    
      // Function to get value for key
    public V get(K key)
    {
        int index = key.hashCode() % capacity;
        LinkedList<Entry<K, V> > bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
    }
}

public class MyHashMap {
    public static void main(String[] args)
    {
        MyHashMap<String, Integer> map = new MyHashMap<>(5);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6); // Collision occurs with "a"

        System.out.println("Value for key 'a': "
                           + map.get("a"));
        System.out.println("Value for key 'f': "
                           + map.get("f"));
    }
}