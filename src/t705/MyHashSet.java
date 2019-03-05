package t705;

class MyHashSet {

    int[] set = new int[1000000];

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {

    }

    public void add(int key) {
        set[key]=1;
    }

    public void remove(int key) {
        set[key]=0;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        if (set[key]==0)
            return false;
        else
            return true;
    }
}