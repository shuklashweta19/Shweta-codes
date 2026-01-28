import java.util.Arrays;

public class moveZero {
        public static void moveZeroes(int[] nums) {
            int pos = 0;
            // Move non-zero elements to the front
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[pos] = nums[i];
                    pos++;
                }
            }
            // Fill the remaining positions with zeros
            for (int i = pos; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);
            System.out.print("[");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

