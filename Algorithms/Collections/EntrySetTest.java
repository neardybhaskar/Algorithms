package Collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author Bhaskar Singh
 * @date 4/14/2021 12:29 AM
 */
public class EntrySetTest implements Map {


    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("c","c");

        Set<Map.Entry<String,String>> set = hashMap.entrySet();


        String[] a = new String[]{"a", "b"};
        List<String> arrayList = Arrays.asList(a);

        System.out.println(1 << 13);

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    transient Set<Map.Entry<String,String>> entrySet;

    @Override
    public Set<Entry<String, String>> entrySet() {
        Set<Map.Entry<String,String>> es;
        return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    final class EntrySet extends AbstractSet<Entry<String,String>> {

        @Override
        public Iterator<Entry<String, String>> iterator() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }
}
