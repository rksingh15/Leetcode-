class Solution {
    // Boyer-Moore Voting Algorithm  (Best in efficiency)      On ,,O1
    public int majorityElement(int[] nums) {
         int count = 0, candidate = 0;
    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }
        count += (num == candidate) ? 1 : -1;
    }
    return candidate;
    }
}
