public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0, i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] < height[j]) {
                maxWater = Math.max(maxWater, height[i] * (j - i));
                i++;
            } else {
                maxWater = Math.max(maxWater, height[j] * (j - i));
                j--;
            }
        }

        return maxWater;
    }
}
