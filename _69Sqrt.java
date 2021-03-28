public class _69Sqrt {
    public int mySqrt(int x) {
        double result = x;
        double diff = 0.1;
        while (diff < Math.abs(x - result * result)) {
            result = (result + x / result) / 2.0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        _69Sqrt solution = new _69Sqrt();
        System.out.println(solution.mySqrt(2147395599));
        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(0));
    }
}
