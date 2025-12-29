class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int key = 5;
        for (int i = 0; i < a.length; i++)
            if (a[i] == key)
                System.out.println("Found at " + i);
    }
}
