class ProductOfNumbers {
    ArrayList<Integer> prefix;
    int product;
    public ProductOfNumbers() {
        prefix = new ArrayList<>();
        product = 1;
    }
    public void add(int num) {
        if (num == 0) {
            prefix.clear();
            product = 1;
        } else {
            product *= num;
            prefix.add(product);
        }
    }
    
    public int getProduct(int k) {
        if (k > prefix.size()) {
            return 0;
        }
        int n = prefix.size();
        if (k == n) {
            return prefix.get(n - 1);
        }
        return prefix.get(n - 1) / prefix.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */