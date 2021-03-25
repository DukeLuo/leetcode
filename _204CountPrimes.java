import java.util.Arrays;

public class _204CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] flags = new boolean[n];
        Arrays.fill(flags, true);
        for (int i = 2; i * i < n; i++) {
            if (!flags[i]) {
                continue;
            }
            for(int j = 2; i * j < n; j++) {
                flags[i*j] = false;
            }
        }
        int count = -2;
        for (boolean flag : flags) {
            if (flag) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        _204CountPrimes solution = new _204CountPrimes();
        System.out.println(solution.countPrimes(10));
        System.out.println(solution.countPrimes(3));
        System.out.println(solution.countPrimes(0));
    }
}
