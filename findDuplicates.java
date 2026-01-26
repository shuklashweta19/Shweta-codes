import java.util.HashSet;

public class findDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int no: nums){
            if(set.contains(no)){
                return true ;
            }
            set.add(no);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate? " + result);
    }
}
