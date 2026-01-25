public class twoSum {
    public static int[] Sum(int[] num, int key) {
        int[] result = new int[2];

        for(int i=0 ; i<num.length ; i++){
            for(int j=i+1 ; j<num.length ; j++){
                if(num[i]+num[j] == key){
                    result[0] = i ;
                    result[1] = j ;
                    return result ;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int key = 9;

        int[] result = Sum(num, key);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
