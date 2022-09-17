import java.util.*;

//O(n!*n)
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        permute(nums, result, results);
        return results;
    }

    private void permute(int[] nums, List<Integer> result, List<List<Integer>> results) {

        if (result.size() == nums.length) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                continue;
            }
            result.add(nums[i]);
            permute(nums, result, results);
            result.remove(result.size() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Permutation permu = new Permutation();
        int[] nums = new int[] { 1, 2, 3 };

        System.out.println(permu.permute(nums));
    }
}
