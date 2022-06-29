public class mySqrt {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int start = 1;
        int finish = x;
        int mid;
        while (start <= finish) {
            mid = start + (finish - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                finish = mid - 1;
            } else if (mid < x / mid) {
                start = mid + 1;
            }
        }
        return finish;
    }
}
