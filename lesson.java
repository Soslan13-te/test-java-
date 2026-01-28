import java.util.Arrays;

public class lesson {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 6;

        // 1. Критически важный шаг: сортировка по возрастанию
        Arrays.sort(nums); // nums станет: [-4, -1, 1, 2]
        System.out.println("Отсортированный массив: " + Arrays.toString(nums));


        int l = 0;
        int right = nums.length - 1;
        int sum = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        while (l < right) {
            int cSum = nums[l] + nums[right];


            if (Math.abs(cSum - target) < min) {
                min = Math.abs(cSum - target);
                sum = cSum;
            }


            if (cSum < target) {
                l++;
            } else if (cSum > target) {
                right--;
            } else {

                sum = cSum;
                break;
            }
        }

        System.out.println("Ближайшая сумма к " + target + ": " + sum);
    }
}