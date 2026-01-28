public class plusOne {
        public static int[] plusOne1(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
            }

            int[] result = new int[digits.length + 1];
            result[0] = 1;

            return result;
        }
    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        int[] answer = plusOne1(digits);
        System.out.print("[");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
