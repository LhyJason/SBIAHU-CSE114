class PingPong {
    private int[] weights = new int[12];

    public int measure(int[] left, int[] right) {
    }

    public void swap(int i, int j) {
        int k = weights[i];
        weights[i] = weights[j];
        weights[j] = k;
    }

    private int getDefective() {
    }

    public static void main(String[] args) {
        PingPong p = new PingPong();
        int id = Exercise.findDefective(p);
        int expected = p.getDefective();
        if (id == expected) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}