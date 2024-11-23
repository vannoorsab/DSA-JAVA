///Count Frequency and Max Frequency Apporach

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freqs = new int[101];
        int max = 0;
        for (int num : nums) {
            freqs[num] += 1;
            if (max < freqs[num]) {
                max = freqs[num];
            }
        }
        int out = 0;
        for (int f : freqs) {
            if (f == max) {
                out += f;
            }
        }

        return out;
    }
}