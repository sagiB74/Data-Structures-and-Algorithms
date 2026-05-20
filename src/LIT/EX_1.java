package LIT;

import java.util.HashSet;
import java.util.Set;

public class EX_1 {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int left = 0;
        int currSum = 0;
        int best = 0;

        for (int right = 0; right < nums.length; right ++){
            int x = nums[right];
            while (seen.contains(x)){
                seen.remove(nums[left]);
                currSum -= nums[left];
                left++;

            }

            seen.add(x);
            currSum += x;

            if (currSum > best){
                best = currSum;
            }
        }



        return best;
    }

}
