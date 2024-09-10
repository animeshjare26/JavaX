package DSA_sheet;

class P2 {

    public static class Pair {
        long first, second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Min: " + first + ", Max: " + second;
        }
    }

    static Pair getMinMax(long a[], long n) {
        long maxNo = Long.MIN_VALUE;
        long minNo = Long.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (maxNo < a[i]) {
                maxNo = a[i];
            }
            if (minNo > a[i]) {
                minNo = a[i];
            }
        }
        return new Pair(minNo, maxNo);
    }

    public static void main(String args[]) {
        long a[] = { 3, 2, 1, 56, 10000, 167 };
        long n = 6;
        P2.Pair result = getMinMax(a, n);
        System.out.println(result);
    }
}
