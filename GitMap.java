package Git;

import java.util.HashMap;
import java.util.Set;

public class GitMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "один");
        hashMap.put(2, "два");
        hashMap.put(3, "три");
        hashMap.put(4, "четыре");
        hashMap.put(5, "пять");
        hashMap.put(6, "шесть");
        hashMap.put(7, "семь");
        hashMap.put(8, "восемь");
        hashMap.put(9, "девять");
        hashMap.put(10, "десять");
        hashMap.put(11, "одиннадцать");
        hashMap.put(12, "двенадцать");
        hashMap.put(13, "тринадцать");
        Set<Integer> keySet = hashMap.keySet();
        for (Integer value : keySet) {
            if (hashMap.get(value).contains("цать")) {
                System.out.println(value);
            }
        }
    }
}
