class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> data;
    private Random rnd;

    public RandomizedSet() {
        this.map = new HashMap<>();
        this.data = new ArrayList<>();
        this.rnd = new Random();
    }
    
    public boolean insert(int val) {
        if (this.map.containsKey(val)) return false;
        this.map.put(val, this.data.size());
        this.data.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!this.map.containsKey(val)) return false;
        int removedIndex = (int) this.map.remove(val);
        int lastIndex = this.data.size() - 1;
        this.map.replace(this.data.get(lastIndex), removedIndex);
        Collections.swap(this.data, removedIndex, lastIndex);
        this.data.remove(lastIndex);
        return true;
    }
    
    public int getRandom() {
        return this.data.get(rnd.nextInt(this.data.size()));
    }
}
