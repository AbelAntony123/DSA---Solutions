class MaxMinArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 1, 9};
        int max = a[0], min = a[0];
        for (int i : a) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.println(max + " " + min);
    }
}
