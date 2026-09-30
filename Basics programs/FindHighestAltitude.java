public class FindHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int sum = 0, maxi = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }
}
