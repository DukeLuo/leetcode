public class _190ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
//            System.out.println("index:" + i);
//            System.out.println("binary:" + Integer.toString(n,2));
            if ((n >> 31 & 1) == 1) { // determine the leftest bit is 1
                result += 1 << i; // i power of 2
            }
            n = n << 1; // move to left by 1 bit
        }
        return result;
    }

    public static void main(String[] args) {
        _190ReverseBits solution = new _190ReverseBits();
        System.out.println(solution.reverseBits(43261596));
        System.out.println(solution.reverseBits(4));
        System.out.println(solution.reverseBits(0));
    }
}
