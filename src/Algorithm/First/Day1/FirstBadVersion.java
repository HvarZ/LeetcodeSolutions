package Algorithm.First.Day1;

public class FirstBadVersion {
    public boolean isBadVersion(int n) {
        return true;
    }

    public int firstBadVersion(int n) {
        int start = 1;

        while (start < n) {
            int mid = start + (n - start) / 2;
            if (isBadVersion(mid)) {
                n = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
