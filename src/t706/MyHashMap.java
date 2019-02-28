package t706;

import java.util.ArrayList;

class MyHashMap {

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(3));
        myHashMap.put(2, 1);
        System.out.println(myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2));
    }

    int[] map = new int[1000000];

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        map[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return map[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        map[key]=-1;
    }

//    ArrayList<int[]> mapList = new ArrayList<>();
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyHashMap() {
//
//    }
//
//    /**
//     * value will always be non-negative.
//     */
//    public void put(int key, int value) {
//        remove(key);
//        int[] map = new int[2];
//        map[0] = key;
//        map[1] = value;
//        mapList.add(map);
//    }
//
//    /**
//     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
//     */
//    public int get(int key) {
//        for (int[] x : mapList) {
//            if (x[0] == key)
//                return x[1];
//        }
//        return -1;
//    }
//
//    /**
//     * Removes the mapping of the specified value key if this map contains a mapping for the key
//     */
//    public void remove(int key) {
//        for (int[] x : mapList) {
//            if (x[0] == key) {
//                mapList.remove(x);
//                break;
//            }
//        }
//    }
}
