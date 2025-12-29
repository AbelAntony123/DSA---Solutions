class SecondLargest {
    public static void main(String[] args) {
        int[] a = {4, 2, 7, 5};
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i : a) {
            if (i > max) {
                second = max;
                max = i;
            } else if (i > second && i != max)
                second = i;
        }
        System.out.println(second);
    }
}
