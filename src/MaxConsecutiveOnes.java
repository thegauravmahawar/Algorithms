public class MaxConsecutiveOnes {

    public static void main(String... args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    /**
     * We use two variables to solve the problem - <b>maxOnes</b> - which will keep track of the maximum consecutive ones
     * encountered till now, and <b>seqOnes</b> - which will keep track of the maximum consecutive ones in the current
     * sequence.
     *
     * If we encounter 1, we keep on incrementing the value of seqOnes. Whenever, the value is 0, we calculate the
     * maxOnes encountered till now and set seqOnes to 0 before the next iteration starts.
     *
     * Another case might come where the maximum consecutive ones are encountered at the end of the array, for that,
     * we have another check after the loop, which compares the value of seqOnes with maxOnes, if seqOnes is larger, then
     * the value of seqOnes is returned else the value of maxOnes is returned.
     *
     * @param nums an array of binary integers
     * @return maximum number of consecutive 1's in the array
     */
    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int seqOnes = 0;
        for (int num : nums) {
            if (num == 1) seqOnes++;
            else {
                maxOnes = Math.max(maxOnes, seqOnes);
                seqOnes = 0;
            }
        }
        if (seqOnes > maxOnes) return seqOnes;
        return maxOnes;
    }
}
